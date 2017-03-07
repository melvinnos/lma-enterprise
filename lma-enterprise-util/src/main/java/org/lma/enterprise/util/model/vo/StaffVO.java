package org.lma.enterprise.util.model.vo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the STAFF database table.
 * 
 */
@Entity
@Table(name="STAFF")
public class StaffVO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STAFF_PK")
	private Long staffPk;

	@Column(name="STAFF_FIRST_NAME")
	private String staffFirstName;

	@Column(name="STAFF_LAST_NAME")
	private String staffLastName;

	@Column(name="STAFF_REPORTS_TO")
	private Double staffReportsTo;

	@Column(name="STAFF_ROLE")
	private String staffRole;

	//bi-directional many-to-one association to Branch
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BRANCH_ID")
	private BranchVO branch;

	public StaffVO() {
	}

	public Long getStaffPk() {
		return this.staffPk;
	}

	public void setStaffPk(Long staffPk) {
		this.staffPk = staffPk;
	}

	public String getStaffFirstName() {
		return this.staffFirstName;
	}

	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	public String getStaffLastName() {
		return this.staffLastName;
	}

	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	public Double getStaffReportsTo() {
		return this.staffReportsTo;
	}

	public void setStaffReportsTo(Double staffReportsTo) {
		this.staffReportsTo = staffReportsTo;
	}

	public String getStaffRole() {
		return this.staffRole;
	}

	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole;
	}

	public BranchVO getBranchVO() {
		return this.branch;
	}

	public void setBranchVO(BranchVO branch) {
		this.branch = branch;
	}

}