
package com.xelerator.service.core;


public class WorkFlowExecutionException extends RuntimeException{
        private Throwable cause = null;
        /**
         * 
         */
        private static final long serialVersionUID = -8440592041645589723L;
        /**
         * 
         */
        public WorkFlowExecutionException() {
    	// TODO Auto-generated constructor stub
        }
        /**
         * 
         * @param message
         */
        public WorkFlowExecutionException(String message){
        	super(message);
        }
        /**
         * 
         * @param cause  Throwable object
         */
        public WorkFlowExecutionException(Throwable cause){
        	super(cause);
        	this.cause=cause;
        }
        
        /**
         * 
         * @param message
         * @param throwable
         */
        public WorkFlowExecutionException(String message, Throwable throwable){
        	super(message,throwable);
        }
        /**
         * 
         */
        public Throwable getCause() {
    	    return cause;
        }
        /**
         * 
         */
    	public void printStackTrace() {
        	super.printStackTrace();
            	if (cause != null) {
            		System.err.println("Caused by:");
            		cause.printStackTrace();
            	}
    	}
    	/**
    	 * 
    	 */
    	public void printStackTrace(java.io.PrintStream ps) {
    		super.printStackTrace(ps);
        	if (cause != null) {
            	ps.println("Caused by:");
            	cause.printStackTrace(ps);
        	}
    	}
    	/**
    	 * 
    	 */
    	public void printStackTrace(java.io.PrintWriter pw) {
    		super.printStackTrace(pw);
        	if (cause != null) {
            	pw.println("Caused by:");
            	cause.printStackTrace(pw);
        	}
    	}	
}



