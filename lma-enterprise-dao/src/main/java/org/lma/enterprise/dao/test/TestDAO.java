package org.lma.enterprise.dao.test;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.lma.enterprise.dao.DAO;
import org.lma.enterprise.exception.ExceptionDao;
import org.lma.enterprise.util.model.vo.RestaurantVO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository("testDAO")
@ComponentScan(basePackages = "org.lma.enterprise")
public class TestDAO extends DAO implements TestDAOi, Serializable{

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
		//Criteria criteria = getSession().createCriteria(RestaurantVO.class);
		 
		LOGGER.debug("Inside the DAO");
		return "message from dao";
	}
}
