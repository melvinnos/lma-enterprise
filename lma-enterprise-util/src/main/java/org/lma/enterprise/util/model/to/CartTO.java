package org.lma.enterprise.util.model.to;

import java.util.Date;

public class CartTO extends TO{
	private static final long serialVersionUID = 1L;

	private Long cartPk;
	
	private Long profilePk;

	private Date cartDate;

	private Date cartTime;

	private Double cartTotal;

	private String cartUserFirstName;

	private String cartUserLastName;

	private String cartUserMail;

	private String cartUserPhone;

	public Long getCartPk() {
		return cartPk;
	}

	public void setCartPk(Long cartPk) {
		this.cartPk = cartPk;
	}

	public Long getProfilePk() {
		return profilePk;
	}

	public void setProfilePk(Long profilePk) {
		this.profilePk = profilePk;
	}

	public Date getCartDate() {
		return cartDate;
	}

	public void setCartDate(Date cartDate) {
		this.cartDate = cartDate;
	}

	public Date getCartTime() {
		return cartTime;
	}

	public void setCartTime(Date cartTime) {
		this.cartTime = cartTime;
	}

	public Double getCartTotal() {
		return cartTotal;
	}

	public void setCartTotal(Double cartTotal) {
		this.cartTotal = cartTotal;
	}

	public String getCartUserFirstName() {
		return cartUserFirstName;
	}

	public void setCartUserFirstName(String cartUserFirstName) {
		this.cartUserFirstName = cartUserFirstName;
	}

	public String getCartUserLastName() {
		return cartUserLastName;
	}

	public void setCartUserLastName(String cartUserLastName) {
		this.cartUserLastName = cartUserLastName;
	}

	public String getCartUserMail() {
		return cartUserMail;
	}

	public void setCartUserMail(String cartUserMail) {
		this.cartUserMail = cartUserMail;
	}

	public String getCartUserPhone() {
		return cartUserPhone;
	}

	public void setCartUserPhone(String cartUserPhone) {
		this.cartUserPhone = cartUserPhone;
	}
}