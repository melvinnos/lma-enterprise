package org.lma.enterprise.util.model.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the ORDERS database table.
 * 
 */
@Entity
@Table(name="ORDERS")
public class OrderVO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ORDER_PK")
	private Long orderPk;

	@Column(name="ORDER_QTY")
	private Double orderQty;

	//bi-directional many-to-one association to Cart
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ORDER_CART_ID")
	private CartVO cart;

	//bi-directional many-to-one association to Product
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ORDER_PRODUCT_ID")
	private ProductVO product;

	public OrderVO() {
	}

	public Long getOrderPk() {
		return this.orderPk;
	}

	public void setOrderPk(Long orderPk) {
		this.orderPk = orderPk;
	}

	public Double getOrderQty() {
		return this.orderQty;
	}

	public void setOrderQty(Double orderQty) {
		this.orderQty = orderQty;
	}

	public CartVO getCart() {
		return this.cart;
	}

	public void setCart(CartVO cart) {
		this.cart = cart;
	}

	public ProductVO getProduct() {
		return this.product;
	}

	public void setProduct(ProductVO product) {
		this.product = product;
	}

}