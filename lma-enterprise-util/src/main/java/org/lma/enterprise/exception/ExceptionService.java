package org.lma.enterprise.exception;

import java.io.Serializable;

public class ExceptionService extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** Parameters */
	private Object[] parameters;
	
	/**
	 * 
	 */
	public ExceptionService() { 
		super(); 
	}
	
	/**
	 * 
	 * @param message
	 */
	public ExceptionService(String message) { 
		super(message); 
	}
	
	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public ExceptionService(String message, Throwable cause) { 
		super(message, cause); 
	}
	
	/**
	 * 
	 * @param cause
	 */
	public ExceptionService(Throwable cause) { 
		super(cause); 
	}
	
	/**
	 * @param message
	 * @param parameters
	 */
	public ExceptionService(String message, Object[] parameters) {
		super(message);
		this.parameters = parameters;
	}
	
	/**
	 * @param message
	 * @param throwable
	 * @param parameters
	 */
	public ExceptionService(String message, Throwable throwable, Object[] parameters) {
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
