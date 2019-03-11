package com.xelerator.service.core;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractTask<C extends WorkFlowContext, RQ, RS> implements Task<C, RQ, RS> {

    private final static Logger logger = LoggerFactory.getLogger(AbstractTask.class);

    private int taskSequenceNo;

    public int getTaskSequenceNumber() {
        return this.taskSequenceNo;
    }

    public void setTaskSequenceNumber(int taskSequenceNo) {
        this.taskSequenceNo = taskSequenceNo;

    }


}
