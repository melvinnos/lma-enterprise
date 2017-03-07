package org.lma.enterprise.util.transformers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.util.TransformerHelperi;
import org.lma.enterprise.util.model.to.OrderTO;
import org.lma.enterprise.util.model.vo.CartVO;
import org.lma.enterprise.util.model.vo.OrderVO;
import org.lma.enterprise.util.model.vo.ProductVO;

public class OrderTransformer implements TransformerHelperi<OrderTO, OrderVO>{

	/** Logger */
	private static final Logger LOGGER = Logger.getLogger(OrderTransformer.class);
	
	public void transform2ValueObject(OrderVO valueObject, OrderTO transferObject) throws ExceptionService {
		try {
			if (transferObject != null){
				valueObject.setOrderPk(transferObject.getOrderPk());
				valueObject.setOrderQty(transferObject.getOrderQty());
				
				if(valueObject.getCart() == null){
					valueObject.setCart(new CartVO());
				}
				
				valueObject.getCart().setCartPk(transferObject.getCartPk());
				
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

	public void transform2TransferObject(OrderTO transferObject, OrderVO valueObject)
			throws ExceptionService {
		try {
			if (valueObject != null){
				transferObject.setOrderPk(valueObject.getOrderPk());
				transferObject.setOrderQty(valueObject.getOrderQty());
				
				transferObject.setCartPk(valueObject.getCart().getCartPk());
				transferObject.setProductPk(valueObject.getProduct().getProductPk());
			}
		}catch (Exception e) {
			ExceptionService exception = new ExceptionService(e.getMessage());
			
			LOGGER.error("An error has ocurred while transforming TO to VO", e);
			throw exception;
		}
	}

	public List<OrderTO> transform2TransferObject(List<OrderVO> listValueObject) throws ExceptionService {
		List<OrderTO> listTransferObject = null;
		OrderTO trasferObject;
		
		try{
			if(listValueObject != null){
				listTransferObject = new ArrayList<OrderTO>();
				
				for(OrderVO valueObject:listValueObject){
					trasferObject = new OrderTO();
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

	public List<OrderVO> transform2ValueObject(List<OrderTO> listTransferObject) throws ExceptionService {
		List<OrderVO> listValueObject = null;
		OrderVO valueObject;
		
		try{
			if(listTransferObject != null){
				listValueObject = new ArrayList<OrderVO>();
				
				for(OrderTO transferObject:listTransferObject){
					valueObject = new OrderVO();
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
