package org.lma.enterprise.util.transformers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.util.TransformerHelperi;
import org.lma.enterprise.util.model.to.TableTO;
import org.lma.enterprise.util.model.vo.BranchVO;
import org.lma.enterprise.util.model.vo.TableVO;

public class TableTransformer implements TransformerHelperi<TableTO, TableVO>{

	/** Logger */
	private static final Logger LOGGER = Logger.getLogger(TableTransformer.class);
	
	public void transform2ValueObject(TableVO valueObject, TableTO transferObject) throws ExceptionService {
		try {
			if (transferObject != null){
				valueObject.setTablePk(transferObject.getTablePk());
				valueObject.setTableAvbChairs(transferObject.getTableAvbChairs());
				valueObject.setTableName(transferObject.getTableName());
				valueObject.setTableReservable(transferObject.getTableReservable());
				valueObject.setTableType(transferObject.getTableType());
				
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

	public void transform2TransferObject(TableTO transferObject, TableVO valueObject)
			throws ExceptionService {
		try {
			if (valueObject != null){
				transferObject.setTablePk(valueObject.getTablePk());
				transferObject.setTableAvbChairs(valueObject.getTableAvbChairs());
				transferObject.setTableName(valueObject.getTableName());
				transferObject.setTableReservable(valueObject.getTableReservable());
				transferObject.setTableType(valueObject.getTableType());
				
				transferObject.setBranchPk(valueObject.getBranch().getBranchPk());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public List<TableTO> transform2TransferObject(List<TableVO> listValueObject) throws ExceptionService {
		List<TableTO> listTransferObject = null;
		TableTO trasferObject;
		
		try{
			if(listValueObject != null){
				listTransferObject = new ArrayList<TableTO>();
				
				for(TableVO valueObject:listValueObject){
					trasferObject = new TableTO();
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

	public List<TableVO> transform2ValueObject(List<TableTO> listTransferObject) throws ExceptionService {
		List<TableVO> listValueObject = null;
		TableVO valueObject;
		
		try{
			if(listTransferObject != null){
				listValueObject = new ArrayList<TableVO>();
				
				for(TableTO transferObject:listTransferObject){
					valueObject = new TableVO();
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
