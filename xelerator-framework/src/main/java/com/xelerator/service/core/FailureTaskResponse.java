package com.xelerator.service.core;

public interface FailureTaskResponse<C extends WorkFlowContext, RQ, RS> {

	void prepareTaskFailureResponse(RQ orderRequest, RS orderServiceRespons, C workFlowContext);

}
