package org.lma.enterprise.dao.test;

import java.io.Serializable;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository("testDAO")
@ComponentScan(basePackages = "org.lma.enterprise")
public class TestDAO implements TestDAOi, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @return
	 */
	public String retrieveMessage(){
		return "message from dao";
	}
}
