package org.lma.enterprise.dao.restaurant;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.dao.DAO;
import org.lma.enterprise.util.model.vo.RestaurantVO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository("restaurantDAO")
@ComponentScan(basePackages = "org.lma.enterprise")
public class RestaurantDAO extends DAO<RestaurantVO> implements RestaurantDAOi, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(RestaurantDAO.class);
}
