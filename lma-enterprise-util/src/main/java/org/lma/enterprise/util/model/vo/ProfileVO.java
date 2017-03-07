package org.lma.enterprise.util.model.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "PROFILE" database table.
 * 
 */
@Entity
@Table(name="PROFILE")
public class ProfileVO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROFILE_PK")
	private Long profilePk;

	@Column(name="PROFILE_SPRING_UID")
	private Double profileSpringUid;

	@Temporal(TemporalType.DATE)
	@Column(name="PROFILE_USER_BD")
	private Date profileUserBd;

	@Column(name="PROFILE_USER_FIRST_NAME")
	private String profileUserFirstName;

	@Column(name="PROFILE_USER_LAST_NAME")
	private String profileUserLastName;

	@Column(name="PROFILE_USER_MAIL")
	private String profileUserMail;

	@Column(name="PROFILE_USER_PHONE")
	private String profileUserPhone;

	//bi-directional many-to-one association to Cart
	@OneToMany(mappedBy="profile")
	private List<CartVO> carts;

	//bi-directional many-to-one association to Reservation
	@OneToMany(mappedBy="profile")
	private List<ReservationVO> reservations;

	public ProfileVO() {
	}

	public Long getProfilePk() {
		return this.profilePk;
	}

	public void setProfilePk(Long profilePk) {
		this.profilePk = profilePk;
	}

	public Double getProfileSpringUid() {
		return this.profileSpringUid;
	}

	public void setProfileSpringUid(Double profileSpringUid) {
		this.profileSpringUid = profileSpringUid;
	}

	public Date getProfileUserBd() {
		return this.profileUserBd;
	}

	public void setProfileUserBd(Date profileUserBd) {
		this.profileUserBd = profileUserBd;
	}

	public String getProfileUserFirstName() {
		return this.profileUserFirstName;
	}

	public void setProfileUserFirstName(String profileUserFirstName) {
		this.profileUserFirstName = profileUserFirstName;
	}

	public String getProfileUserLastName() {
		return this.profileUserLastName;
	}

	public void setProfileUserLastName(String profileUserLastName) {
		this.profileUserLastName = profileUserLastName;
	}

	public String getProfileUserMail() {
		return this.profileUserMail;
	}

	public void setProfileUserMail(String profileUserMail) {
		this.profileUserMail = profileUserMail;
	}

	public String getProfileUserPhone() {
		return this.profileUserPhone;
	}

	public void setProfileUserPhone(String profileUserPhone) {
		this.profileUserPhone = profileUserPhone;
	}

	public List<CartVO> getCarts() {
		return this.carts;
	}

	public void setCarts(List<CartVO> carts) {
		this.carts = carts;
	}

	public List<ReservationVO> getReservations() {
		return this.reservations;
	}

	public void setReservations(List<ReservationVO> reservations) {
		this.reservations = reservations;
	}
}