package org.lma.enterprise.dao.test;

import org.lma.enterprise.exception.ExceptionDao;

public interface TestDAOi {

	/**
	 * 
	 * @return
	 * @throws ExceptionDao
	 */
	public String retrieveMessage()throws ExceptionDao;
}
