package org.lma.enterprise.exception;

import java.io.Serializable;

public class ExceptionController extends Exception implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** Parameters */
	private Object[] parameters;
	
	/**
	 * 
	 */
	public ExceptionController() { 
		super(); 
	}
	
	/**
	 * 
	 * @param message
	 */
	public ExceptionController(String message) { 
		super(message); 
	}
	
	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public ExceptionController(String message, Throwable cause) { 
		super(message, cause); 
	}
	
	/**
	 * 
	 * @param cause
	 */
	public ExceptionController(Throwable cause) { 
		super(cause); 
	}
	
	/**
	 * @param message
	 * @param parameters
	 */
	public ExceptionController(String message, Object[] parameters) {
		super(message);
		this.parameters = parameters;
	}
	
	/**
	 * @param message
	 * @param throwable
	 * @param parameters
	 */
	public ExceptionController(String message, Throwable throwable, Object[] parameters) {
		super(message, throwable);
		this.parameters = parameters;
	}
	
	/**
	 * 
	 * @return
	 */
	public Object[] getParameters() {
		return parameters;
	}

	/**
	 * 
	 * @param parameters
	 */
	public void setParameters(Object[] parameters) {
		this.parameters = parameters;
	}
}
