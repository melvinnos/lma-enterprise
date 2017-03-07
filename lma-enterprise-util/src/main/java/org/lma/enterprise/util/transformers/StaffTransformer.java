package org.lma.enterprise.util.transformers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.util.TransformerHelperi;
import org.lma.enterprise.util.model.to.StaffTO;
import org.lma.enterprise.util.model.vo.BranchVO;
import org.lma.enterprise.util.model.vo.StaffVO;

public class StaffTransformer implements TransformerHelperi<StaffTO, StaffVO>{

	/** Logger */
	private static final Logger LOGGER = Logger.getLogger(StaffTransformer.class);
	
	public void transform2ValueObject(StaffVO valueObject, StaffTO transferObject) throws ExceptionService {
		try {
			if (transferObject != null){
				valueObject.setStaffPk(transferObject.getStaffPk());
				valueObject.setStaffFirstName(transferObject.getStaffFirstName());
				valueObject.setStaffLastName(transferObject.getStaffLastName());
				valueObject.setStaffReportsTo(transferObject.getStaffReportsTo());
				valueObject.setStaffRole(transferObject.getStaffRole());
				
				if(valueObject.getBranch() == null){
					valueObject.setBranch(new BranchVO());
				}
				
				valueObject.getBranch().setBranchPk(transferObject.getBranchPk());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public void transform2TransferObject(StaffTO transferObject, StaffVO valueObject)
			throws ExceptionService {
		try {
			if (valueObject != null){
				transferObject.setStaffPk(valueObject.getStaffPk());
				transferObject.setStaffFirstName(valueObject.getStaffFirstName());
				transferObject.setStaffLastName(valueObject.getStaffLastName());
				transferObject.setStaffReportsTo(valueObject.getStaffReportsTo());
				transferObject.setStaffRole(valueObject.getStaffRole());
				
				transferObject.setBranchPk(valueObject.getBranch().getBranchPk());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public List<StaffTO> transform2TransferObject(List<StaffVO> listValueObject) throws ExceptionService {
		List<StaffTO> listTransferObject = null;
		StaffTO trasferObject;
		
		try{
			if(listValueObject != null){
				listTransferObject = new ArrayList<StaffTO>();
				
				for(StaffVO valueObject:listValueObject){
					trasferObject = new StaffTO();
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

	public List<StaffVO> transform2ValueObject(List<StaffTO> listTransferObject) throws ExceptionService {
		List<StaffVO> listValueObject = null;
		StaffVO valueObject;
		
		try{
			if(listTransferObject != null){
				listValueObject = new ArrayList<StaffVO>();
				
				for(StaffTO transferObject:listTransferObject){
					valueObject = new StaffVO();
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
