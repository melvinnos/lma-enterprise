package org.lma.enterprise.util.transformers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.util.TransformerHelperi;
import org.lma.enterprise.util.model.to.PromoTO;
import org.lma.enterprise.util.model.vo.BranchVO;
import org.lma.enterprise.util.model.vo.ProductVO;
import org.lma.enterprise.util.model.vo.PromoVO;

public class PromoTransformer implements TransformerHelperi<PromoTO, PromoVO>{

	/** Logger */
	private static final Logger LOGGER = Logger.getLogger(PromoTransformer.class);
	
	public void transform2ValueObject(PromoVO valueObject, PromoTO transferObject) throws ExceptionService {
		try {
			if (transferObject != null){
				valueObject.setPromoPk(transferObject.getPromoPk());
				valueObject.setPromoDesc(transferObject.getPromoDesc());
				valueObject.setPromoEndDate(transferObject.getPromoEndDate());
				valueObject.setPromoPrice(transferObject.getPromoPrice());
				valueObject.setPromoStartDate(transferObject.getPromoStartDate());
				
				if(valueObject.getBranch() == null){
					valueObject.setBranch(new BranchVO());
				}
				
				valueObject.getBranch().setBranchPk(transferObject.getBranchPk());
				
				if(valueObject.getProduct() == null){
					valueObject.setProduct(new ProductVO());
				}
				
				valueObject.getProduct().setProductPk(transferObject.getProductPk());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public void transform2TransferObject(PromoTO transferObject, PromoVO valueObject)
			throws ExceptionService {
		try {
			if (valueObject != null){
				transferObject.setPromoPk(valueObject.getPromoPk());
				transferObject.setPromoDesc(valueObject.getPromoDesc());
				transferObject.setPromoEndDate(valueObject.getPromoEndDate());
				transferObject.setPromoPrice(valueObject.getPromoPrice());
				transferObject.setPromoStartDate(valueObject.getPromoStartDate());
				
				transferObject.setBranchPk(valueObject.getBranch().getBranchPk());
				transferObject.setProductPk(valueObject.getProduct().getProductPk());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public List<PromoTO> transform2TransferObject(List<PromoVO> listValueObject) throws ExceptionService {
		List<PromoTO> listTransferObject = null;
		PromoTO trasferObject;
		
		try{
			if(listValueObject != null){
				listTransferObject = new ArrayList<PromoTO>();
				
				for(PromoVO valueObject:listValueObject){
					trasferObject = new PromoTO();
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

	public List<PromoVO> transform2ValueObject(List<PromoTO> listTransferObject) throws ExceptionService {
		List<PromoVO> listValueObject = null;
		PromoVO valueObject;
		
		try{
			if(listTransferObject != null){
				listValueObject = new ArrayList<PromoVO>();
				
				for(PromoTO transferObject:listTransferObject){
					valueObject = new PromoVO();
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

