package org.lma.enterprise.bs.branch;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.BS;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("branchBS")
@ComponentScan(basePackages = "org.lma.enterprise")
public class BranchBS extends BS implements BranchBSi{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(BranchBS.class);
}
