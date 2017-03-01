package org.lma.enterprise.exception;

public class ExceptionController extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ExceptionController() { 
		super(); 
	}
	public ExceptionController(String message) { 
		super(message); 
	}
	public ExceptionController(String message, Throwable cause) { 
		super(message, cause); 
	}
	public ExceptionController(Throwable cause) { 
		super(cause); 
	}

}
