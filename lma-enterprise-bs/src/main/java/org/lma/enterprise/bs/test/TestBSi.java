package org.lma.enterprise.bs.test;

import org.lma.enterprise.bs.BSi;
import org.lma.enterprise.exception.ExceptionService;

public interface TestBSi extends BSi {
	
	/**
	 * 
	 * @return
	 * @throws ExceptionService
	 */
	public String retrieveMessage() throws ExceptionService;
}
