package org.lma.enterprise.bs.test;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.BS;
import org.lma.enterprise.dao.test.TestDAOi;
import org.lma.enterprise.exception.ExceptionDao;
import org.lma.enterprise.exception.ExceptionService;
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
	private static final Logger LOGGER = Logger.getLogger(TestBS.class);
	
	@Autowired
	private TestDAOi testDAO;

	
	public String retrieveMessage() throws ExceptionService{
		LOGGER.debug("Inside the BS");
		
		try{
			return testDAO.retrieveMessage();
		}catch(ExceptionDao eD){
			throw new ExceptionService(eD.getMessage());
		}
	}

	public TestBS(){
		LOGGER.debug("Constructor");
	}
}
