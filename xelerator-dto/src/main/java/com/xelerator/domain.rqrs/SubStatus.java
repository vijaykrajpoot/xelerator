package com.xelerator.domain.rqrs;

public class SubStatus {

	protected StatusType subStatusType;
	protected String subStatusCode;
	protected String subStatusMessage;
	
	/**
	 * @return the subStatusType
	 */
	public StatusType getSubStatusType() {
		return subStatusType;
	}
	/**
	 * @param subStatusType the subStatusType to set
	 */
	public void setSubStatusType(StatusType subStatusType) {
		this.subStatusType = subStatusType;
	}
	/**
	 * @return the subStatusCode
	 */
	public String getSubStatusCode() {
		return subStatusCode;
	}
	/**
	 * @param subStatusCode the subStatusCode to set
	 */
	public void setSubStatusCode(String subStatusCode) {
		this.subStatusCode = subStatusCode;
	}
	/**
	 * @return the subStatusMessage
	 */
	public String getSubStatusMessage() {
		return subStatusMessage;
	}
	/**
	 * @param subStatusMessage the subStatusMessage to set
	 */
	public void setSubStatusMessage(String subStatusMessage) {
		this.subStatusMessage = subStatusMessage;
	}

	

}
