package org.lma.enterprise.bs.staff;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.BS;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("staffBS")
@ComponentScan(basePackages = "org.lma.enterprise")
public class StaffBS extends BS implements StaffBSi{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(StaffBS.class);
}
