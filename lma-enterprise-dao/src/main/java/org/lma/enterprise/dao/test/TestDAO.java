package org.lma.enterprise.dao.test;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.exception.ExceptionDao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository("testDAO")
@ComponentScan(basePackages = "org.lma.enterprise")
public class TestDAO implements TestDAOi, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(TestDAO.class);
	
	/**
	 * 
	 * @return
	 * @throws ExceptionDao
	 */
	public String retrieveMessage()throws ExceptionDao{
		LOGGER.debug("Inside the DAO");
		return "message from dao";
	}
}
