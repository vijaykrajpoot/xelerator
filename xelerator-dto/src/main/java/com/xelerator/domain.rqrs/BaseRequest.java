package com.xelerator.domain.rqrs;

public class BaseRequest {
	
	protected String requestId;
	protected String requestOriginBy;
	protected String purchaseFlowId;
	protected boolean retry;
	
	
	
	
	public BaseRequest() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Unique request id
	 * @return
	 */
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	
	public String getRequestOriginBy() {
		return requestOriginBy;
	}
	
	/**
	 * System who is calling this API
	 * 
	 * @param requestOriginBy
	 */
	public void setRequestOriginBy(String requestOriginBy) {
		this.requestOriginBy = requestOriginBy;
	}

	
	/**
	 * @return the purchaseFlowId
	 */
	public String getPurchaseFlowId() {
		return purchaseFlowId;
	}
	/**
	 * @param purchaseFlowId the purchaseFlowId to set
	 */
	public void setPurchaseFlowId(String purchaseFlowId) {
		this.purchaseFlowId = purchaseFlowId;
	}
	public boolean isRetry() {
		return retry;
	}

	public void setRetry(boolean retry) {
		this.retry = retry;
	}
	
	
	
	
	
	
}
