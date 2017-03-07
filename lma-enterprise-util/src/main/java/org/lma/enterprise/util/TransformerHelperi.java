package org.lma.enterprise.util;

import java.io.Serializable;
import java.util.List;

import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.util.model.to.TO;

/**
 * Interface for transformations.
 * 
 *
 * @param <T> Transfer Object.
 * @param <S> Value Object.
 */
public interface TransformerHelperi		
		<T extends TO, S extends Serializable>  {

	/**
	 * Transforms a Transfer Object to a Value Object.
	 * 
	 * @param valueObject 
	 * @param transferObject
	 * @throws ExceptionService 
	 */
	public void transform2ValueObject(S valueObject, T transferObject) throws ExceptionService;
	
	/**
	 * Transforms a Value Object to a Transfer Object.
	 * 
	 * @param transferObject 
	 * @param valueObject
	 * @throws ExceptionService 
	 */
	public void transform2TransferObject(T transferObject, S valueObject) throws ExceptionService;
	
	/**
	 * Transforms a Value Object List to a Transfer Object List.
	 * 
	 * @param listValueObject
	 * @return
	 * @throws ExceptionService
	 */
	public List<T> transform2TransferObject(List<S> listValueObject)throws ExceptionService;
	
	/**
	 * Transforms a Transfer Object List to a Value Object List.
	 * 
	 * @param listTrasferObject
	 * @return
	 * @throws ExceptionService
	 */
	public List<S> transform2ValueObject(List<T> listTransferObject)throws ExceptionService;
	
}
