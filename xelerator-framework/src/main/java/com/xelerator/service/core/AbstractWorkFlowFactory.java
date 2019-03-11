/**
 *
 */
package com.xelerator.service.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @param <RQ>
 * @param <RS>
 * @author homepc
 */
@Component
public abstract class AbstractWorkFlowFactory<W extends WorkFlow<T, C, RQ, RS>, T extends Task<C, RQ, RS>, C extends WorkFlowContext, RQ, RS> implements WorkFlowFactory<W, T, C, RQ, RS> {

    private final static Logger logger = LoggerFactory.getLogger(AbstractWorkFlowFactory.class);


    public AbstractWorkFlowFactory() {
        // TODO Auto-generated constructor stub
    }

}
