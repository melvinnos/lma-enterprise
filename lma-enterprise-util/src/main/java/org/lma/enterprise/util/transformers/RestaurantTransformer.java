package org.lma.enterprise.util.transformers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.util.TransformerHelperi;
import org.lma.enterprise.util.model.to.RestaurantTO;
import org.lma.enterprise.util.model.vo.RestaurantVO;

public class RestaurantTransformer implements TransformerHelperi<RestaurantTO, RestaurantVO>{

	/** Logger */
	private static final Logger LOGGER = Logger.getLogger(RestaurantTransformer.class);
	
	public void transform2ValueObject(RestaurantVO valueObject, RestaurantTO transferObject) throws ExceptionService {
		try {
			if (transferObject != null){
				valueObject.setId(transferObject.getId());
				valueObject.setName(transferObject.getName());
				valueObject.setLogo(transferObject.getLogo());
				valueObject.setFoodType(transferObject.getFoodType());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public void transform2TransferObject(RestaurantTO transferObject, RestaurantVO valueObject)
			throws ExceptionService {
		try {
			if (valueObject != null){
				transferObject.setId(valueObject.getId());
				transferObject.setName(valueObject.getName());
				transferObject.setLogo(valueObject.getLogo());
				transferObject.setFoodType(valueObject.getFoodType());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public List<RestaurantTO> transform2TransferObject(List<RestaurantVO> listValueObject) throws ExceptionService {
		List<RestaurantTO> listTransferObject = null;
		RestaurantTO trasferObject;
		
		try{
			if(listValueObject != null){
				listTransferObject = new ArrayList<RestaurantTO>();
				
				for(RestaurantVO valueObject:listValueObject){
					trasferObject = new RestaurantTO();
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

	public List<RestaurantVO> transform2ValueObject(List<RestaurantTO> listTransferObject) throws ExceptionService {
		List<RestaurantVO> listValueObject = null;
		RestaurantVO valueObject;
		
		try{
			if(listTransferObject != null){
				listValueObject = new ArrayList<RestaurantVO>();
				
				for(RestaurantTO transferObject:listTransferObject){
					valueObject = new RestaurantVO();
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
