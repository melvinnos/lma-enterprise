package org.lma.enterprise.dao.cart;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.dao.DAO;
import org.lma.enterprise.util.model.vo.CartVO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository("cartDAO")
@ComponentScan(basePackages = "org.lma.enterprise")
public class CartDAO extends DAO<CartVO> implements CartDAOi, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(CartDAO.class);
}
