package org.lma.enterprise.util.model.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the RESERVATIONS database table.
 * 
 */
@Entity
@Table(name="RESERVATIONS")
public class ReservationVO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RESERVATION_PK")
	private Long reservationPk;

	@Column(name="RESERVATION_CHAIR_COUNT")
	private Double reservationChairCount;

	@Temporal(TemporalType.DATE)
	@Column(name="RESERVATION_DATE")
	private Date reservationDate;

	@Column(name="RESERVATION_TIME")
	private Timestamp reservationTime;

	@Column(name="RESERVATION_USER_FIRST_NAME")
	private String reservationUserFirstName;

	@Column(name="RESERVATION_USER_LAST_NAME")
	private String reservationUserLastName;

	@Column(name="RESERVATION_USER_MAIL")
	private String reservationUserMail;

	@Column(name="RESERVATION_USER_PHONE")
	private String reservationUserPhone;

	//bi-directional many-to-one association to Profile
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RESERVATION_PROFILE_ID")
	private ProfileVO profile;

	//bi-directional many-to-one association to Table
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="RESERVATION_BRANCH_ID", referencedColumnName="BRANCH_ID"),
		@JoinColumn(name="RESERVATION_TABLE_ID", referencedColumnName="TABLE_PK")
		})
	private TableVO table;

	public ReservationVO() {
	}

	public Long getReservationPk() {
		return this.reservationPk;
	}

	public void setReservationPk(Long reservationPk) {
		this.reservationPk = reservationPk;
	}

	public Double getReservationChairCount() {
		return this.reservationChairCount;
	}

	public void setReservationChairCount(Double reservationChairCount) {
		this.reservationChairCount = reservationChairCount;
	}

	public Date getReservationDate() {
		return this.reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public Timestamp getReservationTime() {
		return this.reservationTime;
	}

	public void setReservationTime(Timestamp reservationTime) {
		this.reservationTime = reservationTime;
	}

	public String getReservationUserFirstName() {
		return this.reservationUserFirstName;
	}

	public void setReservationUserFirstName(String reservationUserFirstName) {
		this.reservationUserFirstName = reservationUserFirstName;
	}

	public String getReservationUserLastName() {
		return this.reservationUserLastName;
	}

	public void setReservationUserLastName(String reservationUserLastName) {
		this.reservationUserLastName = reservationUserLastName;
	}

	public String getReservationUserMail() {
		return this.reservationUserMail;
	}

	public void setReservationUserMail(String reservationUserMail) {
		this.reservationUserMail = reservationUserMail;
	}

	public String getReservationUserPhone() {
		return this.reservationUserPhone;
	}

	public void setReservationUserPhone(String reservationUserPhone) {
		this.reservationUserPhone = reservationUserPhone;
	}

	public ProfileVO getProfile() {
		return this.profile;
	}

	public void setProfile(ProfileVO profile) {
		this.profile = profile;
	}

	public TableVO getTable() {
		return this.table;
	}

	public void setTable(TableVO table) {
		this.table = table;
	}

}