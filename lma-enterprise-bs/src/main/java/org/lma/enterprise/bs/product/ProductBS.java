package org.lma.enterprise.bs.product;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.BS;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("productBS")
@ComponentScan(basePackages = "org.lma.enterprise")
public class ProductBS extends BS implements ProductBSi{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ProductBS.class);
}
