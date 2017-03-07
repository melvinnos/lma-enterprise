package org.lma.enterprise.dao.order;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.dao.DAO;
import org.lma.enterprise.util.model.vo.OrderVO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository("orderDAO")
@ComponentScan(basePackages = "org.lma.enterprise")
public class OrderDAO extends DAO<OrderVO> implements OrderDAOi, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(OrderDAO.class);
}
