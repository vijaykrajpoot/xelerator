/**
 * 
 */
package com.xelerator.service.core;


public class InvalidTaskException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7211417027349643041L;

	/**
	 * 
	 */
	public InvalidTaskException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public InvalidTaskException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public InvalidTaskException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidTaskException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
