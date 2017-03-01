package org.lma.enterprise.exception;

public class ExceptionDao extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ExceptionDao() { 
		super(); 
	}
	public ExceptionDao(String message) { 
		super(message); 
	}
	public ExceptionDao(String message, Throwable cause) { 
		super(message, cause); 
	}
	public ExceptionDao(Throwable cause) { 
		super(cause); 
	}

}
