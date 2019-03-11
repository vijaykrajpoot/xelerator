package com.xelerator.service.core;

public interface Context<K,V,RQ,RS> {

	/**
	 * Saves a value identified by a key
	 * 
	 * @param key
	 *            a key
	 * @param value
	 *            a value
	 */
	void setAttribute(K key, V value);

	/**
	 * Returns a value given a key
	 * 
	 * @param key
	 *            a key
	 * @return a value given a key
	 */
	V getAttribute(K key);
	
	public RQ getRequest() ;
		

	public void setRequest(RQ request);

	public RS getResponse() ;

	public void setResponse(RS response) ;
	
	public void removeAttribute(K key); 
}
