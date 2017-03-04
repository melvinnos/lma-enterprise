package org.lma.enterprise.exception;

import java.io.Serializable;

public class ExceptionDao extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** Parameters */
	private Object[] parameters;
	
	/**
	 * 
	 */
	public ExceptionDao() { 
		super(); 
	}
	
	/**
	 * 
	 * @param message
	 */
	public ExceptionDao(String message) { 
		super(message); 
	}
	
	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public ExceptionDao(String message, Throwable cause) { 
		super(message, cause); 
	}
	
	/**
	 * 
	 * @param cause
	 */
	public ExceptionDao(Throwable cause) { 
		super(cause); 
	}
	
	/**
	 * @param message
	 * @param parameters
	 */
	public ExceptionDao(String message, Object[] parameters) {
		super(message);
		this.parameters = parameters;
	}
	
	/**
	 * @param message
	 * @param throwable
	 * @param parameters
	 */
	public ExceptionDao(String message, Throwable throwable, Object[] parameters) {
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
