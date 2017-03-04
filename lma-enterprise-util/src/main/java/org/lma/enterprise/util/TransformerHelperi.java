package org.lma.enterprise.util;

import java.io.Serializable;

import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.util.model.to.TO;

/**
 * Interface for VO to BO and BO to VO transformations.
 * 
 * @author JCI
 *
 * @param <T> Business Object.
 * @param <S> Value Object.
 */
public interface TransformerHelperi		
		<T extends TO, S extends Serializable>  {

	/**
	 * Transforms a Business Object to a Value Object.
	 * 
	 * @param valueObject 
	 * @param businessObject
	 * @throws JciBatWMBOException 
	 */
	public void transform2ValueObject(S valueObject, T businessObject) throws ExceptionService;
	
	/**
	 * Transforms a Value Object to a Business Object.
	 * 
	 * @param businessObject 
	 * @param valueObject
	 * @throws JciBatWMBOException 
	 */
	public void transform2BusinessObject(T businessObject, S valueObject) throws ExceptionService;
	
}
