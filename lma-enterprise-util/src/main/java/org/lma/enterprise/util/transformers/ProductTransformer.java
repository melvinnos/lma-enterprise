package org.lma.enterprise.util.transformers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.util.TransformerHelperi;
import org.lma.enterprise.util.model.to.ProductTO;
import org.lma.enterprise.util.model.vo.ProductVO;

public class ProductTransformer implements TransformerHelperi<ProductTO, ProductVO>{

	/** Logger */
	private static final Logger LOGGER = Logger.getLogger(ProductTransformer.class);
	
	public void transform2ValueObject(ProductVO valueObject, ProductTO transferObject) throws ExceptionService {
		try {
			if (transferObject != null){
				valueObject.setProductPk(transferObject.getProductPk());
				valueObject.setProductName(transferObject.getProductName());
				valueObject.setProductActive(transferObject.getProductActive());
				valueObject.setProductDetailDescription(transferObject.getProductDetailDescription());
				valueObject.setProductUnitPrice(transferObject.getProductUnitPrice());
				valueObject.setProductShortDesc(transferObject.getProductShortDesc());
				valueObject.setProductStock(transferObject.getProductStock());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public void transform2TransferObject(ProductTO transferObject, ProductVO valueObject)
			throws ExceptionService {
		try {
			if (valueObject != null){
				transferObject.setProductPk(valueObject.getProductPk());
				transferObject.setProductName(valueObject.getProductName());
				transferObject.setProductActive(valueObject.getProductActive());
				transferObject.setProductDetailDescription(valueObject.getProductDetailDescription());
				transferObject.setProductUnitPrice(valueObject.getProductUnitPrice());
				transferObject.setProductShortDesc(valueObject.getProductShortDesc());
				transferObject.setProductStock(valueObject.getProductStock());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public List<ProductTO> transform2TransferObject(List<ProductVO> listValueObject) throws ExceptionService {
		List<ProductTO> listTransferObject = null;
		ProductTO trasferObject;
		
		try{
			if(listValueObject != null){
				listTransferObject = new ArrayList<ProductTO>();
				
				for(ProductVO valueObject:listValueObject){
					trasferObject = new ProductTO();
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

	public List<ProductVO> transform2ValueObject(List<ProductTO> listTransferObject) throws ExceptionService {
		List<ProductVO> listValueObject = null;
		ProductVO valueObject;
		
		try{
			if(listTransferObject != null){
				listValueObject = new ArrayList<ProductVO>();
				
				for(ProductTO transferObject:listTransferObject){
					valueObject = new ProductVO();
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
