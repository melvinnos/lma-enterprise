package org.lma.enterprise.dao.product;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.dao.DAO;
import org.lma.enterprise.util.model.vo.ProductVO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository("productDAO")
@ComponentScan(basePackages = "org.lma.enterprise")
public class ProductDAO extends DAO<ProductVO> implements ProductDAOi, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ProductDAO.class);
}
