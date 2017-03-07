package org.lma.enterprise.util.transformers;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.util.TransformerHelperi;
import org.lma.enterprise.util.model.to.CartTO;
import org.lma.enterprise.util.model.vo.CartVO;
import org.lma.enterprise.util.model.vo.ProfileVO;

public class CartTransformer implements TransformerHelperi<CartTO, CartVO>{

	/** Logger */
	private static final Logger LOGGER = Logger.getLogger(CartTransformer.class);
	
	public void transform2ValueObject(CartVO valueObject, CartTO transferObject) throws ExceptionService {
		try {
			if (transferObject != null){
				valueObject.setCartPk(transferObject.getCartPk());
				valueObject.setCartDate(transferObject.getCartDate());
				valueObject.setCartTime(new Timestamp(transferObject.getCartTime().getTime()));
				valueObject.setCartTotal(transferObject.getCartTotal());
				valueObject.setCartUserFirstName(transferObject.getCartUserFirstName());
				valueObject.setCartUserLastName(transferObject.getCartUserLastName());
				valueObject.setCartUserMail(transferObject.getCartUserMail());
				valueObject.setCartUserPhone(transferObject.getCartUserPhone());
				
				if(valueObject.getProfile() == null){
					valueObject.setProfile(new ProfileVO());
				}
				
				valueObject.getProfile().setProfilePk(transferObject.getProfilePk());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public void transform2TransferObject(CartTO transferObject, CartVO valueObject)
			throws ExceptionService {
		try {
			if (valueObject != null){
				transferObject.setCartPk(valueObject.getCartPk());
				transferObject.setCartDate(valueObject.getCartDate());
				transferObject.setCartTime(valueObject.getCartTime());
				transferObject.setCartTotal(valueObject.getCartTotal());
				transferObject.setCartUserFirstName(valueObject.getCartUserFirstName());
				transferObject.setCartUserLastName(valueObject.getCartUserLastName());
				transferObject.setCartUserMail(valueObject.getCartUserMail());
				transferObject.setCartUserPhone(valueObject.getCartUserPhone());
				
				transferObject.setProfilePk(valueObject.getProfile().getProfilePk());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public List<CartTO> transform2TransferObject(List<CartVO> listValueObject) throws ExceptionService {
		List<CartTO> listTransferObject = null;
		CartTO trasferObject;
		
		try{
			if(listValueObject != null){
				listTransferObject = new ArrayList<CartTO>();
				
				for(CartVO valueObject:listValueObject){
					trasferObject = new CartTO();
					transform2TransferObject(trasferObject, valueObject);
					listTransferObject.add(trasferObject);
				}				
			}
		} catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming list<VO> to list<TO>", e);
			throw exception;
		}	
		
		return listTransferObject;
	}

	public List<CartVO> transform2ValueObject(List<CartTO> listTransferObject) throws ExceptionService {
		List<CartVO> listValueObject = null;
		CartVO valueObject;
		
		try{
			if(listTransferObject != null){
				listValueObject = new ArrayList<CartVO>();
				
				for(CartTO transferObject:listTransferObject){
					valueObject = new CartVO();
					transform2ValueObject(valueObject, transferObject);
					listValueObject.add(valueObject);
				}				
			}
		} catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming list<TO> to list<VO>", e);
			throw exception;
		}	
		
		return listValueObject;
	}
}
