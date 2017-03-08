package org.lma.enterprise.bs.cart;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.BS;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("cartBS")
@ComponentScan(basePackages = "org.lma.enterprise")
public class CartBS extends BS implements CartBSi{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(CartBS.class);
}
