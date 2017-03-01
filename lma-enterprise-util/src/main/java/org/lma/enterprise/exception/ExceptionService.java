package org.lma.enterprise.exception;

public class ExceptionService extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ExceptionService() { 
		super(); 
	}
	public ExceptionService(String message) { 
		super(message); 
	}
	public ExceptionService(String message, Throwable cause) { 
		super(message, cause); 
	}
	public ExceptionService(Throwable cause) { 
		super(cause); 
	}

}
