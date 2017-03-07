package org.lma.enterprise.util.model.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the PROMOS database table.
 * 
 */
@Entity
@Table(name="PROMOS")
public class PromoVO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROMO_PK")
	private Long promoPk;

	@Column(name="PROMO_DESC")
	private String promoDesc;

	@Temporal(TemporalType.DATE)
	@Column(name="PROMO_END_DATE")
	private Date promoEndDate;

	@Column(name="PROMO_PRICE")
	private Double promoPrice;

	@Temporal(TemporalType.DATE)
	@Column(name="PROMO_START_DATE")
	private Date promoStartDate;

	//bi-directional many-to-one association to Branch
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PROMO_BRANCH_ID")
	private BranchVO branchVO;

	//bi-directional many-to-one association to Product
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PROMO_PRODUCT_ID")
	private ProductVO product;

	public PromoVO() {
	}

	public Long getPromoPk() {
		return this.promoPk;
	}

	public void setPromoPk(Long promoPk) {
		this.promoPk = promoPk;
	}

	public String getPromoDesc() {
		return this.promoDesc;
	}

	public void setPromoDesc(String promoDesc) {
		this.promoDesc = promoDesc;
	}

	public Date getPromoEndDate() {
		return this.promoEndDate;
	}

	public void setPromoEndDate(Date promoEndDate) {
		this.promoEndDate = promoEndDate;
	}

	public Double getPromoPrice() {
		return this.promoPrice;
	}

	public void setPromoPrice(Double promoPrice) {
		this.promoPrice = promoPrice;
	}

	public Date getPromoStartDate() {
		return this.promoStartDate;
	}

	public void setPromoStartDate(Date promoStartDate) {
		this.promoStartDate = promoStartDate;
	}

	public BranchVO getBranchVO() {
		return this.branchVO;
	}

	public void setBranchVO(BranchVO branchVO) {
		this.branchVO = branchVO;
	}

	public ProductVO getProduct() {
		return this.product;
	}

	public void setProduct(ProductVO product) {
		this.product = product;
	}

}