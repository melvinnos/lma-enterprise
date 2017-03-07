package org.lma.enterprise.util.transformers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.util.TransformerHelperi;
import org.lma.enterprise.util.model.to.ProfileTO;
import org.lma.enterprise.util.model.vo.ProfileVO;

public class ProfileTransformer implements TransformerHelperi<ProfileTO, ProfileVO>{

	/** Logger */
	private static final Logger LOGGER = Logger.getLogger(ProfileTransformer.class);
	
	public void transform2ValueObject(ProfileVO valueObject, ProfileTO transferObject) throws ExceptionService {
		try {
			if (transferObject != null){
				valueObject.setProfilePk(transferObject.getProfilePk());
				valueObject.setProfileSpringUid(transferObject.getProfileSpringUid());
				valueObject.setProfileUserBd(transferObject.getProfileUserBd());
				valueObject.setProfileUserFirstName(transferObject.getProfileUserFirstName());
				valueObject.setProfileUserLastName(transferObject.getProfileUserLastName());
				valueObject.setProfileUserMail(transferObject.getProfileUserMail());
				valueObject.setProfileUserPhone(transferObject.getProfileUserPhone());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public void transform2TransferObject(ProfileTO transferObject, ProfileVO valueObject)
			throws ExceptionService {
		try {
			if (valueObject != null){
				transferObject.setProfilePk(valueObject.getProfilePk());
				transferObject.setProfileSpringUid(valueObject.getProfileSpringUid());
				transferObject.setProfileUserBd(valueObject.getProfileUserBd());
				transferObject.setProfileUserFirstName(valueObject.getProfileUserFirstName());
				transferObject.setProfileUserLastName(valueObject.getProfileUserLastName());
				transferObject.setProfileUserMail(valueObject.getProfileUserMail());
				transferObject.setProfileUserPhone(valueObject.getProfileUserPhone());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public List<ProfileTO> transform2TransferObject(List<ProfileVO> listValueObject) throws ExceptionService {
		List<ProfileTO> listTransferObject = null;
		ProfileTO trasferObject;
		
		try{
			if(listValueObject != null){
				listTransferObject = new ArrayList<ProfileTO>();
				
				for(ProfileVO valueObject:listValueObject){
					trasferObject = new ProfileTO();
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

	public List<ProfileVO> transform2ValueObject(List<ProfileTO> listTransferObject) throws ExceptionService {
		List<ProfileVO> listValueObject = null;
		ProfileVO valueObject;
		
		try{
			if(listTransferObject != null){
				listValueObject = new ArrayList<ProfileVO>();
				
				for(ProfileTO transferObject:listTransferObject){
					valueObject = new ProfileVO();
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
