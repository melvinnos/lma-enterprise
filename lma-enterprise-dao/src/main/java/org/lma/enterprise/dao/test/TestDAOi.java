package org.lma.enterprise.dao.test;

import org.lma.enterprise.dao.DAOi;
import org.lma.enterprise.exception.ExceptionDao;
import org.lma.enterprise.util.model.vo.RestaurantVO;

public interface TestDAOi extends DAOi<RestaurantVO>{

	/**
	 * 
	 * @return
	 * @throws ExceptionDao
	 */
	public String retrieveMessage()throws ExceptionDao;
}
