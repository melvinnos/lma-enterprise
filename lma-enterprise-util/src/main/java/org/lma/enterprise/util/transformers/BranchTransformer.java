package org.lma.enterprise.util.transformers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.util.TransformerHelperi;
import org.lma.enterprise.util.model.to.BranchTO;
import org.lma.enterprise.util.model.vo.BranchVO;

public class BranchTransformer implements TransformerHelperi<BranchTO, BranchVO>{

	/** Logger */
	private static final Logger LOGGER = Logger.getLogger(BranchTransformer.class);
	
	public void transform2ValueObject(BranchVO valueObject, BranchTO transferObject) throws ExceptionService {
		try {
			if (transferObject != null){
				valueObject.setId(transferObject.getId());
				valueObject.setName(transferObject.getName());
				valueObject.setRestaurantId(transferObject.getRestaurantId());
				valueObject.setAddress(transferObject.getAddress());
				valueObject.setPhone(transferObject.getPhone());
				valueObject.setEmail(transferObject.getEmail());
				valueObject.setCoordinates(transferObject.getCoordinates());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public void transform2TransferObject(BranchTO transferObject, BranchVO valueObject)
			throws ExceptionService {
		try {
			if (valueObject != null){
				transferObject.setId(valueObject.getId());
				transferObject.setName(valueObject.getName());
				transferObject.setRestaurantId(valueObject.getRestaurantId());
				transferObject.setAddress(valueObject.getAddress());
				transferObject.setPhone(valueObject.getPhone());
				transferObject.setEmail(valueObject.getEmail());
				transferObject.setCoordinates(valueObject.getCoordinates());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public List<BranchTO> transform2TransferObject(List<BranchVO> listValueObject) throws ExceptionService {
		List<BranchTO> listTransferObject = null;
		BranchTO trasferObject;
		
		try{
			if(listValueObject != null){
				listTransferObject = new ArrayList<BranchTO>();
				
				for(BranchVO valueObject:listValueObject){
					trasferObject = new BranchTO();
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

	public List<BranchVO> transform2ValueObject(List<BranchTO> listTransferObject) throws ExceptionService {
		List<BranchVO> listValueObject = null;
		BranchVO valueObject;
		
		try{
			if(listTransferObject != null){
				listValueObject = new ArrayList<BranchVO>();
				
				for(BranchTO transferObject:listTransferObject){
					valueObject = new BranchVO();
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
