package org.lma.enterprise.util.model.to;

public class ProductTO extends TO{
	private static final long serialVersionUID = 1L;

	private Long productPk;

	private Double productActive;

	private String productDetailDescription;

	private String productName;

	private String productShortDesc;

	private Double productStock;

	private Double productUnitPrice;

	public Long getProductPk() {
		return productPk;
	}

	public void setProductPk(Long productPk) {
		this.productPk = productPk;
	}

	public Double getProductActive() {
		return productActive;
	}

	public void setProductActive(Double productActive) {
		this.productActive = productActive;
	}

	public String getProductDetailDescription() {
		return productDetailDescription;
	}

	public void setProductDetailDescription(String productDetailDescription) {
		this.productDetailDescription = productDetailDescription;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductShortDesc() {
		return productShortDesc;
	}

	public void setProductShortDesc(String productShortDesc) {
		this.productShortDesc = productShortDesc;
	}

	public Double getProductStock() {
		return productStock;
	}

	public void setProductStock(Double productStock) {
		this.productStock = productStock;
	}

	public Double getProductUnitPrice() {
		return productUnitPrice;
	}

	public void setProductUnitPrice(Double productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}
}