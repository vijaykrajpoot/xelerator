package com.xelerator.service.core;


import java.util.List;

public class ErrorDTO {
	// Enumerated error code.

	private String errorCode;
	// actual error message
	private String errorMessage;
	protected String errorSubStatusCode;
	protected String errorSubStatusMessage;
	private List<String> ss;
	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the errorSubStatusCode
	 */
	public String getErrorSubStatusCode() {
		return errorSubStatusCode;
	}
	/**
	 * @param errorSubStatusCode the errorSubStatusCode to set
	 */
	public void setErrorSubStatusCode(String errorSubStatusCode) {
		this.errorSubStatusCode = errorSubStatusCode;
	}
	/**
	 * @return the errorSubStatusMessage
	 */
	public String getErrorSubStatusMessage() {
		return errorSubStatusMessage;
	}
	/**
	 * @param errorSubStatusMessage the errorSubStatusMessage to set
	 */
	public void setErrorSubStatusMessage(String errorSubStatusMessage) {
		this.errorSubStatusMessage = errorSubStatusMessage;
	}
	
	
}
