package org.lma.enterprise.util.model.to;

public class OrderTO extends TO{
	private static final long serialVersionUID = 1L;

	private Long orderPk;

	private Double orderQty;

	private Long cartPk;
	
	private Long productPk;

	public Long getOrderPk() {
		return orderPk;
	}

	public void setOrderPk(Long orderPk) {
		this.orderPk = orderPk;
	}

	public Double getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(Double orderQty) {
		this.orderQty = orderQty;
	}

	public Long getCartPk() {
		return cartPk;
	}

	public void setCartPk(Long cartPk) {
		this.cartPk = cartPk;
	}

	public Long getProductPk() {
		return productPk;
	}

	public void setProductPk(Long productPk) {
		this.productPk = productPk;
	}
}