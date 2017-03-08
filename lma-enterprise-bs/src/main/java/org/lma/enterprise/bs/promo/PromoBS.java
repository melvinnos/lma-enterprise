package org.lma.enterprise.bs.promo;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.BS;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("promoBS")
@ComponentScan(basePackages = "org.lma.enterprise")
public class PromoBS extends BS implements PromoBSi{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(PromoBS.class);
}
