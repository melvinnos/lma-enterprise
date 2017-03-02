package org.lma.enterprise.dao.test;

import org.lma.enterprise.dao.DAOi;
import org.lma.enterprise.exception.ExceptionDao;

public interface TestDAOi extends DAOi{

	/**
	 * 
	 * @return
	 * @throws ExceptionDao
	 */
	public String retrieveMessage()throws ExceptionDao;
}
