package org.lma.enterprise.bs.table;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.BS;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("tableBS")
@ComponentScan(basePackages = "org.lma.enterprise")
public class TableBS extends BS implements TableBSi{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(TableBS.class);
}
