package org.lma.enterprise.dao.test;

import java.io.Serializable;
import java.util.List;

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
		LOGGER.debug("Inside the DAO");
		List<RestaurantVO> results;
		String retValue = "message from dao";
		
		try{
			Criteria criteria = getSession().createCriteria(RestaurantVO.class);
			results = (List<RestaurantVO>)criteria.list();
			
			if(results != null && results.size() > 0){
				retValue = results.get(0).getName();
			}
		}catch(Exception exception){
			LOGGER.error("An error has happened while querying the database", exception);
			throw new ExceptionDao(exception.getMessage());
		}
		
		return retValue;
	}
}
