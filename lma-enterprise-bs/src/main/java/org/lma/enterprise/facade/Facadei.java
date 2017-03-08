package org.lma.enterprise.facade;

import org.lma.enterprise.exception.ExceptionService;

public interface Facadei {
	
	/**
	 * Retrieves a Test Message
	 * 
	 * @return
	 * @throws ExceptionService
	 */
	public String retrieveMessage()throws ExceptionService;;
}
