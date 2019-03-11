/**
 * 
 */
package com.xelerator.service.core;

import org.springframework.stereotype.Service;

/**
 * Task interface has defined four abstract methods which have to be implemented by sub classes. This interface defined an enumeration of the task which is utilized by the implemented classes as
 * constant to identify their type.
 * 
 * @author Vijay kumar
 *
 */
@Service
public interface Task<C extends WorkFlowContext, RQ, RS> {

	/**
	 * Implementation of actual business logic.
	 * 
	 * @param request
	 * @param response
	 * @param context
	 * @throws Exception
	 */
	TaskStatus execute(RQ request, RS response, C context) throws TaskExecutionException;

	/**
	 * 
	 * @return task type based on enumeration
	 */
	public TaskType getTaskType();

	/**
	 * 
	 * @return name of implemented Task
	 */
	public String getTaskName();

	/**
	 * 
	 * @return task execution order based on declaration
	 */
	int getTaskSequenceNumber();
	
	/**
	 * Set task sequence 
	 * @param taskSequenceNo
	 */
	void setTaskSequenceNumber(int taskSequenceNo);

	/**
	 * Task wants to skip in some scenarios or skip based on configuration
	 *
	 * @return
	 */
	boolean skipMe();
	
	
	/**
	 *  evaluates if this task needs to be execute or not based on this result.
	 *  
	 *  In some case if task has been executed and based on certain criteria we want to execute it again than return true else false
	 * 
	 * @param context
	 * @return boolean
	 */
	boolean evaluate(RQ request, RS response, C context);
	
}
