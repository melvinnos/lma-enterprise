package org.lma.enterprise.util.model.to;

import java.util.Date;

public class ProfileTO extends TO{
	private static final long serialVersionUID = 1L;

	private Long profilePk;

	private Double profileSpringUid;

	private Date profileUserBd;

	private String profileUserFirstName;

	private String profileUserLastName;

	private String profileUserMail;

	private String profileUserPhone;

	public Long getProfilePk() {
		return profilePk;
	}

	public void setProfilePk(Long profilePk) {
		this.profilePk = profilePk;
	}

	public Double getProfileSpringUid() {
		return profileSpringUid;
	}

	public void setProfileSpringUid(Double profileSpringUid) {
		this.profileSpringUid = profileSpringUid;
	}

	public Date getProfileUserBd() {
		return profileUserBd;
	}

	public void setProfileUserBd(Date profileUserBd) {
		this.profileUserBd = profileUserBd;
	}

	public String getProfileUserFirstName() {
		return profileUserFirstName;
	}

	public void setProfileUserFirstName(String profileUserFirstName) {
		this.profileUserFirstName = profileUserFirstName;
	}

	public String getProfileUserLastName() {
		return profileUserLastName;
	}

	public void setProfileUserLastName(String profileUserLastName) {
		this.profileUserLastName = profileUserLastName;
	}

	public String getProfileUserMail() {
		return profileUserMail;
	}

	public void setProfileUserMail(String profileUserMail) {
		this.profileUserMail = profileUserMail;
	}

	public String getProfileUserPhone() {
		return profileUserPhone;
	}

	public void setProfileUserPhone(String profileUserPhone) {
		this.profileUserPhone = profileUserPhone;
	}
}