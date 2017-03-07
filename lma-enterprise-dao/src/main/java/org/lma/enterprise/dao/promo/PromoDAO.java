package org.lma.enterprise.dao.promo;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.dao.DAO;
import org.lma.enterprise.util.model.vo.PromoVO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository("promoDAO")
@ComponentScan(basePackages = "org.lma.enterprise")
public class PromoDAO extends DAO<PromoVO> implements PromoDAOi, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(PromoDAO.class);
}
