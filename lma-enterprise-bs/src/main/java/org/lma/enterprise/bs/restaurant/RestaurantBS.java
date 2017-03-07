package org.lma.enterprise.bs.restaurant;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.BS;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("restaurantBS")
@ComponentScan(basePackages = "org.lma.enterprise")
public class RestaurantBS extends BS implements RestaurantBSi{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(RestaurantBS.class);
}
