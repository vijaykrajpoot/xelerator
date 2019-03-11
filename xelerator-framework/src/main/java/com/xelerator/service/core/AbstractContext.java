/**
 *
 */
package com.xelerator.service.core;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author vijay
 */
public abstract class AbstractContext<K, V, RQ, RS> implements Context<K, V, RQ, RS> {

    private final ConcurrentMap<K, V> map;

    private RQ request;

    private RS response;

    public AbstractContext() {
        this.map = new ConcurrentHashMap<K, V>();
    }

    public void setAttribute(K key, V value) {
        if (value != null) {
            map.put(key, value);
        }

    }

    public void removeAttribute(K key) {
        map.remove(key);
    }

    public V getAttribute(K key) {
        return map.get(key);
    }

    public RQ getRequest() {
        return request;
    }

    public void setRequest(RQ request) {
        this.request = request;
    }

    public RS getResponse() {
        return response;
    }

    public void setResponse(RS response) {
        this.response = response;
    }


}
