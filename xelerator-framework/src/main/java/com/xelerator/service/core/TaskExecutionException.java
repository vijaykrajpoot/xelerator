package com.xelerator.service.core;

public class TaskExecutionException extends RuntimeException {

	/**
     * 
     */
    private static final long serialVersionUID = 5001436509202795591L;
    	
    	public TaskExecutionException() {
    	
        }
        /**
         * 
         * @param message
         */
        public TaskExecutionException(String message){
        	super(message);
        }
        /**
         * 
         * @param cause  Throwable object
         */
        public TaskExecutionException(Throwable cause){
        	super(cause);
        }
        
        /**
         * 
         * @param message
         * @param throwable
         */
        public TaskExecutionException(String message, Throwable throwable){
        	super(message,throwable);
        }
}



