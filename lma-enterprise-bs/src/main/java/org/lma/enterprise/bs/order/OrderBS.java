package org.lma.enterprise.bs.order;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.BS;
import org.lma.enterprise.dao.order.OrderDAOi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("orderBS")
@ComponentScan(basePackages = "org.lma.enterprise")
public class OrderBS extends BS implements OrderBSi{

	@Autowired
	private OrderDAOi orderDAO;
	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(OrderBS.class);
}
