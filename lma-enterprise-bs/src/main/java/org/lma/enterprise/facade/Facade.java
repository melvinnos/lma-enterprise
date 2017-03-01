package org.lma.enterprise.facade;

import java.io.Serializable;

import org.lma.enterprise.bs.test.TestBSi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("facade")
@ComponentScan(basePackages = "org.lma.enterprise")
public class Facade implements Facadei,Serializable{
	
	/**  */
	private static final long serialVersionUID = 1L;
	
	private TestBSi testBS;
	
	/**
	 * 
	 * @return
	 */
	public String retrieveMessage(){
		return testBS.retrieveMessage();
	}
	
	@Autowired
    public void setTestBS(TestBSi testBS) {
        this.testBS = testBS;
    }
}
