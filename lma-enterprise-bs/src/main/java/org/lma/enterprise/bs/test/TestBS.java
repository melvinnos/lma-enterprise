package org.lma.enterprise.bs.test;

import org.lma.enterprise.bs.BS;
import org.lma.enterprise.dao.test.TestDAOi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("testBS")
@ComponentScan(basePackages = "org.lma.enterprise")
public class TestBS extends BS implements TestBSi {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private TestDAOi testDAO;

	/**
	 * 
	 * @return
	 */
	public String retrieveMessage() {
		return testDAO.retrieveMessage();
	}

}
