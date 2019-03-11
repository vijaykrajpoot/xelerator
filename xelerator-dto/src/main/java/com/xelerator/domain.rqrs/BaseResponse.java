package com.xelerator.domain.rqrs;

public class BaseResponse {

	protected StatusType statusType;
	protected String code;
	protected String message;
	protected SubStatus subStatus;
	/**
	 * Mark is success by default, in case of any service does not make it success  
	 *  
	 */
	public BaseResponse() {
		this.statusType=StatusType.SUCCESS;
		this.code="0000";
		this.message="default message:success";
				
	}

	/**
	 * @return the statusType
	 */
	public StatusType getStatusType() {
		return statusType;
	}

	/**
	 * @param statusType
	 *            the statusType to set
	 */
	public void setStatusType(StatusType statusType) {
		this.statusType = statusType;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the subStatus
	 */
	public SubStatus getSubStatus() {
		return subStatus;
	}

	/**
	 * @param subStatus
	 *            the subStatus to set
	 */
	public void setSubStatus(SubStatus subStatus) {
		this.subStatus = subStatus;
	}

}
