package org.lma.enterprise.util.model.to;

import java.util.Date;

public class PromoTO extends TO{
	private static final long serialVersionUID = 1L;

	private Long promoPk;

	private String promoDesc;

	private Date promoEndDate;

	private Double promoPrice;

	private Date promoStartDate;
	
	private Long productPk;
	
	private Long branchPk;

	public Long getPromoPk() {
		return promoPk;
	}

	public void setPromoPk(Long promoPk) {
		this.promoPk = promoPk;
	}

	public String getPromoDesc() {
		return promoDesc;
	}

	public void setPromoDesc(String promoDesc) {
		this.promoDesc = promoDesc;
	}

	public Date getPromoEndDate() {
		return promoEndDate;
	}

	public void setPromoEndDate(Date promoEndDate) {
		this.promoEndDate = promoEndDate;
	}

	public Double getPromoPrice() {
		return promoPrice;
	}

	public void setPromoPrice(Double promoPrice) {
		this.promoPrice = promoPrice;
	}

	public Date getPromoStartDate() {
		return promoStartDate;
	}

	public void setPromoStartDate(Date promoStartDate) {
		this.promoStartDate = promoStartDate;
	}

	public Long getProductPk() {
		return productPk;
	}

	public void setProductPk(Long productPk) {
		this.productPk = productPk;
	}

	public Long getBranchPk() {
		return branchPk;
	}

	public void setBranchPk(Long branchPk) {
		this.branchPk = branchPk;
	}
}