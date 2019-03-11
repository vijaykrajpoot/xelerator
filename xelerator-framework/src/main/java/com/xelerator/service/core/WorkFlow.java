
package com.xelerator.service.core;

import java.util.List;

import org.springframework.stereotype.Service;





/**
 *
 *
 * Controller represent an entry point of this framework and execute all the 
 * Task according to given order {@link Task}
 *  
 *  
 */
@Service
public interface WorkFlow<T extends Task<C,RQ,RS>,C extends WorkFlowContext,RQ,RS> {
	
	
	/**
	 * Executes a request against this workflow
	 *
	 * @param request
	 *            a request
	 * @param context
	 * 				a context object shared objects between tasks.
	 * @throws WorkflowException
	 *
	 *
	 */

	void execute(RQ request, RS response, C context) throws WorkFlowExecutionException;

	/**
	 * Returns the tasks associated to this workflow
	 * 
	 * @return the tasks associated to this workflow
	 */
	List<T> getTasks();

	/**
	 * Sets the tasks associated to this workflow
	 * 
	 * @param list
	 *            the tasks associated to this workflow
	 */
	void setTasks(List<T> taskList);
	
}
