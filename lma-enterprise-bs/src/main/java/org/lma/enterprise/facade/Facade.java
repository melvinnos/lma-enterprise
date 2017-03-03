package org.lma.enterprise.facade;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.test.TestBSi;
import org.lma.enterprise.exception.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("facade")
@ComponentScan(basePackages = "org.lma.enterprise")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = ExceptionService.class) 
public class Facade implements Facadei,Serializable{
	
	/**  */
	private static final long serialVersionUID = 1L;
	
	private TestBSi testBS;
	private static final Logger LOGGER = Logger.getLogger(Facade.class);
	
	/**
	 * 
	 * @return
	 * @throws ExceptionService
	 */
	public String retrieveMessage()throws ExceptionService{
		LOGGER.debug("Inside the Facade");
		return testBS.retrieveMessage();
	}
	
	@Autowired
    public void setTestBS(TestBSi testBS) {
		LOGGER.debug("Injecting BS: " + testBS);
        this.testBS = testBS;
    }
}
