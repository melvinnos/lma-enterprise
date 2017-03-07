package org.lma.enterprise.util.model.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the CART database table.
 * 
 */
@Entity
@Table(name="CART")
public class CartVO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CART_PK")
	private Long cartPk;

	@Temporal(TemporalType.DATE)
	@Column(name="CART_DATE")
	private Date cartDate;

	@Column(name="CART_TIME")
	private Timestamp cartTime;

	@Column(name="CART_TOTAL")
	private Double cartTotal;

	@Column(name="CART_USER_FIRST_NAME")
	private String cartUserFirstName;

	@Column(name="CART_USER_LAST_NAME")
	private String cartUserLastName;

	@Column(name="CART_USER_MAIL")
	private String cartUserMail;

	@Column(name="CART_USER_PHONE")
	private String cartUserPhone;

	//bi-directional many-to-one association to Profile
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CART_PROFILE_ID")
	private ProfileVO profile;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="cart")
	private List<OrderVO> orders;

	public CartVO() {
	}

	public Long getCartPk() {
		return this.cartPk;
	}

	public void setCartPk(Long cartPk) {
		this.cartPk = cartPk;
	}

	public Date getCartDate() {
		return this.cartDate;
	}

	public void setCartDate(Date cartDate) {
		this.cartDate = cartDate;
	}

	public Timestamp getCartTime() {
		return this.cartTime;
	}

	public void setCartTime(Timestamp cartTime) {
		this.cartTime = cartTime;
	}

	public Double getCartTotal() {
		return this.cartTotal;
	}

	public void setCartTotal(Double cartTotal) {
		this.cartTotal = cartTotal;
	}

	public String getCartUserFirstName() {
		return this.cartUserFirstName;
	}

	public void setCartUserFirstName(String cartUserFirstName) {
		this.cartUserFirstName = cartUserFirstName;
	}

	public String getCartUserLastName() {
		return this.cartUserLastName;
	}

	public void setCartUserLastName(String cartUserLastName) {
		this.cartUserLastName = cartUserLastName;
	}

	public String getCartUserMail() {
		return this.cartUserMail;
	}

	public void setCartUserMail(String cartUserMail) {
		this.cartUserMail = cartUserMail;
	}

	public String getCartUserPhone() {
		return this.cartUserPhone;
	}

	public void setCartUserPhone(String cartUserPhone) {
		this.cartUserPhone = cartUserPhone;
	}

	public ProfileVO getProfile() {
		return this.profile;
	}

	public void setProfile(ProfileVO profile) {
		this.profile = profile;
	}

	public List<OrderVO> getOrders() {
		return this.orders;
	}

	public void setOrders(List<OrderVO> orders) {
		this.orders = orders;
	}
}