package org.lma.enterprise.dao;

import java.io.Serializable;

import org.lma.enterprise.exception.ExceptionDao;

public interface DAOi<CLAZZ extends Serializable> {

	/**
	 * Inserts a new VO.
	 * 
	 * @param vo
	 * @return CLAZZ
	 * @throws ExceptionDAO
	 */
	public CLAZZ insert(CLAZZ vo) throws ExceptionDao;
	
	/**
	 * Deletes a VO.
	 * 
	 * @param vo
	 * @throws ExceptionDao
	 */
	public void delete(CLAZZ vo) throws ExceptionDao;
}
