package org.lma.enterprise.util.model.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PRODUCTS database table.
 * 
 */
@Entity
@Table(name="PRODUCTS")
public class ProductVO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRODUCT_PK")
	private Long productPk;

	@Column(name="PRODUCT_ACTIVE")
	private Double productActive;

	@Column(name="PRODUCT_DETAIL_DESCRIPTION")
	private String productDetailDescription;

	@Column(name="PRODUCT_NAME")
	private String productName;

	@Column(name="PRODUCT_SHORT_DESC")
	private String productShortDesc;

	@Column(name="PRODUCT_STOCK")
	private Double productStock;

	@Column(name="PRODUCT_UNIT_PRICE")
	private Double productUnitPrice;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="product")
	private List<OrderVO> orders;

	//bi-directional many-to-one association to Promo
	@OneToMany(mappedBy="product")
	private List<PromoVO> promos;

	public ProductVO() {
	}

	public Long getProductPk() {
		return this.productPk;
	}

	public void setProductPk(Long productPk) {
		this.productPk = productPk;
	}

	public Double getProductActive() {
		return this.productActive;
	}

	public void setProductActive(Double productActive) {
		this.productActive = productActive;
	}

	public String getProductDetailDescription() {
		return this.productDetailDescription;
	}

	public void setProductDetailDescription(String productDetailDescription) {
		this.productDetailDescription = productDetailDescription;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductShortDesc() {
		return this.productShortDesc;
	}

	public void setProductShortDesc(String productShortDesc) {
		this.productShortDesc = productShortDesc;
	}

	public Double getProductStock() {
		return this.productStock;
	}

	public void setProductStock(Double productStock) {
		this.productStock = productStock;
	}

	public Double getProductUnitPrice() {
		return this.productUnitPrice;
	}

	public void setProductUnitPrice(Double productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}

	public List<OrderVO> getOrders() {
		return this.orders;
	}

	public void setOrders(List<OrderVO> orders) {
		this.orders = orders;
	}

	public List<PromoVO> getPromos() {
		return this.promos;
	}

	public void setPromos(List<PromoVO> promos) {
		this.promos = promos;
	}
}