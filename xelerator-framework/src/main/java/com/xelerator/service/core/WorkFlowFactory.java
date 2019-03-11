package com.xelerator.service.core;

import java.util.Set;

public interface WorkFlowFactory<W extends WorkFlow<T, C, RQ, RS>, T extends Task<C, RQ, RS>, C extends WorkFlowContext, RQ, RS> {

    Set<W> prepareWorkFlows();

}
