package com.xelerator.service.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Vijay Kumar Rajput
 */
@Service
public abstract class AbstractOrderWorkFlow<T extends Task<C, RQ, RS>, C extends WorkFlowContext, RQ, RS> implements WorkFlow<T, C, RQ, RS> {


    private final static Logger logger = LoggerFactory.getLogger(AbstractOrderWorkFlow.class);

    private List<Task<C, RQ, RS>> tasks;


    public void execute(RQ request, RS response, C context) throws WorkFlowExecutionException {
        for (Task<C, RQ, RS> task : tasks) {
            TaskStatus status = TaskStatus.CONTINUE;
            try {
                if (task.skipMe() || !task.evaluate(request, response, context)) {
                    logger.debug(" >>> skipping Task [ " + task.getTaskType() + " @ " + task.getTaskName() + "]");
                    continue;
                }

                logger.debug(" >>> executing Task [ " + task.getTaskType() + " @ " + task.getTaskName() + "]");
                status = task.execute(request, response, context);
                if (status == TaskStatus.SKIP) {
                    logger.debug(">>> Task [" + task.getTaskName() + "] was skipped ");
                    continue;
                }
                if (status == TaskStatus.STOP) {
                    logger.debug(">>> Task [" + task.getTaskName() + "] stopped workflow");
                    break;
                }
                if (status == TaskStatus.CONTINUE) {
                    logger.debug(">>> Task [" + task.getTaskName() + "] continue workflow");
                }
            } catch (Exception e) {
                logger.error("[" + task.getTaskName() + "] could not executed successfully", e);
                // Create failure service result in case of exception
                // @formatter:off
				ErrorDTO errorDTO=ErrorDTOBuilder.errorDTO()
								.withErrorCode("5000")
								.withErrorMessage(e.getMessage())
								.build();
				// @formatter:on
                context.getServiceErrors().add(errorDTO);
            }

        }
    }

}
