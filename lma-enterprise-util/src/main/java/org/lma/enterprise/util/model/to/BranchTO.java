package org.lma.enterprise.util.model.to;

public class BranchTO extends TO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long branchPk;

	private String branchAddress;

	private String branchCoordinates;

	private String branchMail;

	private String branchName;

	private String branchPhone;
	
	private Long restaurantPk;

	public Long getBranchPk() {
		return branchPk;
	}

	public void setBranchPk(Long branchPk) {
		this.branchPk = branchPk;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBranchCoordinates() {
		return branchCoordinates;
	}

	public void setBranchCoordinates(String branchCoordinates) {
		this.branchCoordinates = branchCoordinates;
	}

	public String getBranchMail() {
		return branchMail;
	}

	public void setBranchMail(String branchMail) {
		this.branchMail = branchMail;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchPhone() {
		return branchPhone;
	}

	public void setBranchPhone(String branchPhone) {
		this.branchPhone = branchPhone;
	}

	public Long getRestaurantPk() {
		return restaurantPk;
	}

	public void setRestaurantPk(Long restaurantPk) {
		this.restaurantPk = restaurantPk;
	}
}
