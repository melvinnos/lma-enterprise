package org.lma.enterprise.util.model.to;

import java.util.Date;

public class ReservationTO extends TO{
	private static final long serialVersionUID = 1L;

	private Long reservationPk;

	private Double reservationChairCount;

	private Date reservationDate;
	
	private Date reservationTime;

	private String reservationUserFirstName;

	private String reservationUserLastName;

	private String reservationUserMail;

	private String reservationUserPhone;
	
	private Long tablePk;
	
	private Long profilePk;
	
	private Long branchPk;

	public Long getReservationPk() {
		return reservationPk;
	}

	public void setReservationPk(Long reservationPk) {
		this.reservationPk = reservationPk;
	}

	public Double getReservationChairCount() {
		return reservationChairCount;
	}

	public void setReservationChairCount(Double reservationChairCount) {
		this.reservationChairCount = reservationChairCount;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public Date getReservationTime() {
		return reservationTime;
	}

	public void setReservationTime(Date reservationTime) {
		this.reservationTime = reservationTime;
	}

	public String getReservationUserFirstName() {
		return reservationUserFirstName;
	}

	public void setReservationUserFirstName(String reservationUserFirstName) {
		this.reservationUserFirstName = reservationUserFirstName;
	}

	public String getReservationUserLastName() {
		return reservationUserLastName;
	}

	public void setReservationUserLastName(String reservationUserLastName) {
		this.reservationUserLastName = reservationUserLastName;
	}

	public String getReservationUserMail() {
		return reservationUserMail;
	}

	public void setReservationUserMail(String reservationUserMail) {
		this.reservationUserMail = reservationUserMail;
	}

	public String getReservationUserPhone() {
		return reservationUserPhone;
	}

	public void setReservationUserPhone(String reservationUserPhone) {
		this.reservationUserPhone = reservationUserPhone;
	}

	public Long getTablePk() {
		return tablePk;
	}

	public void setTablePk(Long tablePk) {
		this.tablePk = tablePk;
	}

	public Long getProfilePk() {
		return profilePk;
	}

	public void setProfilePk(Long profilePk) {
		this.profilePk = profilePk;
	}

	public Long getBranchPk() {
		return branchPk;
	}

	public void setBranchPk(Long branchPk) {
		this.branchPk = branchPk;
	}
}