package org.lma.enterprise.util.model.to;

public class StaffTO extends TO{
	private static final long serialVersionUID = 1L;

	private Long staffPk;

	private String staffFirstName;

	private String staffLastName;

	private Long staffReportsTo;

	private String staffRole;
	
	private Long branchPk;

	public Long getStaffPk() {
		return staffPk;
	}

	public void setStaffPk(Long staffPk) {
		this.staffPk = staffPk;
	}

	public String getStaffFirstName() {
		return staffFirstName;
	}

	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	public String getStaffLastName() {
		return staffLastName;
	}

	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	public Long getStaffReportsTo() {
		return staffReportsTo;
	}

	public void setStaffReportsTo(Long staffReportsTo) {
		this.staffReportsTo = staffReportsTo;
	}

	public String getStaffRole() {
		return staffRole;
	}

	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole;
	}

	public Long getBranchPk() {
		return branchPk;
	}

	public void setBranchPk(Long branchPk) {
		this.branchPk = branchPk;
	}
}