package org.lma.enterprise.util.transformers;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.util.TransformerHelperi;
import org.lma.enterprise.util.model.to.ReservationTO;
import org.lma.enterprise.util.model.vo.ProfileVO;
import org.lma.enterprise.util.model.vo.ReservationVO;
import org.lma.enterprise.util.model.vo.TableVO;

public class ReservationTransformer implements TransformerHelperi<ReservationTO, ReservationVO>{

	/** Logger */
	private static final Logger LOGGER = Logger.getLogger(ReservationTransformer.class);
	
	public void transform2ValueObject(ReservationVO valueObject, ReservationTO transferObject) throws ExceptionService {
		try {
			if (transferObject != null){
				valueObject.setReservationPk(transferObject.getReservationPk());
				valueObject.setReservationChairCount(transferObject.getReservationChairCount());
				valueObject.setReservationDate(transferObject.getReservationDate());
				valueObject.setReservationTime(new Timestamp(transferObject.getReservationTime().getTime()));
				valueObject.setReservationUserFirstName(transferObject.getReservationUserFirstName());
				valueObject.setReservationUserLastName(transferObject.getReservationUserLastName());
				valueObject.setReservationUserMail(transferObject.getReservationUserMail());
				valueObject.setReservationUserPhone(transferObject.getReservationUserPhone());
				
				if(valueObject.getTable() == null){
					valueObject.setTable(new TableVO());
				}
				
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

	public void transform2TransferObject(ReservationTO transferObject, ReservationVO valueObject)
			throws ExceptionService {
		try {
			if (valueObject != null){
				transferObject.setReservationPk(valueObject.getReservationPk());
				transferObject.setReservationChairCount(valueObject.getReservationChairCount());
				transferObject.setReservationDate(valueObject.getReservationDate());
				transferObject.setReservationTime(valueObject.getReservationTime());
				transferObject.setReservationUserFirstName(valueObject.getReservationUserFirstName());
				transferObject.setReservationUserLastName(valueObject.getReservationUserLastName());
				transferObject.setReservationUserMail(valueObject.getReservationUserMail());
				transferObject.setReservationUserPhone(valueObject.getReservationUserPhone());
				
				transferObject.setBranchPk(valueObject.getTable().getBranch().getBranchPk());
				transferObject.setTablePk(valueObject.getTable().getTablePk());
				transferObject.setProfilePk(valueObject.getProfile().getProfilePk());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public List<ReservationTO> transform2TransferObject(List<ReservationVO> listValueObject) throws ExceptionService {
		List<ReservationTO> listTransferObject = null;
		ReservationTO trasferObject;
		
		try{
			if(listValueObject != null){
				listTransferObject = new ArrayList<ReservationTO>();
				
				for(ReservationVO valueObject:listValueObject){
					trasferObject = new ReservationTO();
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

	public List<ReservationVO> transform2ValueObject(List<ReservationTO> listTransferObject) throws ExceptionService {
		List<ReservationVO> listValueObject = null;
		ReservationVO valueObject;
		
		try{
			if(listTransferObject != null){
				listValueObject = new ArrayList<ReservationVO>();
				
				for(ReservationTO transferObject:listTransferObject){
					valueObject = new ReservationVO();
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

