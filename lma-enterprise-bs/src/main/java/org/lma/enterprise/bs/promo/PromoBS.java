package org.lma.enterprise.bs.promo;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.BS;
import org.lma.enterprise.dao.promo.PromoDAOi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("promoBS")
@ComponentScan(basePackages = "org.lma.enterprise")
public class PromoBS extends BS implements PromoBSi{

	@Autowired
	private PromoDAOi promoDAO;
	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(PromoBS.class);
}
