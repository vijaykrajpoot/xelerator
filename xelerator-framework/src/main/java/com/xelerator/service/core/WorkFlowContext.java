package com.xelerator.service.core;

import com.xelerator.domain.rqrs.BaseRequest;
import com.xelerator.domain.rqrs.BaseResponse;

import java.util.LinkedList;
import java.util.List;

public class WorkFlowContext<K,V,RQ,RS> extends AbstractContext<K,V,RQ,RS> {

	private List<ErrorDTO> serviceErrors = new LinkedList<ErrorDTO>();


	private String workFlowName;

	/**
	 * @return the serviceErrors
	 */
	public List<ErrorDTO> getServiceErrors() {
		return serviceErrors;
	}



	public String getWorkFlowName() {
		return workFlowName;
	}

	public void setWorkFlowName(String workFlowName) {
		this.workFlowName = workFlowName;
	}
}
