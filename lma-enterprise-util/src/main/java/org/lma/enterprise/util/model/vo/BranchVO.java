package org.lma.enterprise.util.model.vo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BRANCH")
public class BranchVO  implements Serializable{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BRANCH_PK")
	private Long branchPk;

	@Column(name="BRANCH_ADDRESS")
	private String branchAddress;

	@Column(name="BRANCH_COORDINATES")
	private String branchCoordinates;

	@Column(name="BRANCH_MAIL")
	private String branchMail;

	@Column(name="BRANCH_NAME")
	private String branchName;

	@Column(name="BRANCH_PHONE")
	private String branchPhone;

	//bi-directional many-to-one association to Restaurant
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BRANCH_RESTAURANT_ID")
	private RestaurantVO restaurant;

	//bi-directional many-to-one association to Promo
	@OneToMany(mappedBy="branch")
	private List<PromoVO> promos;

	//bi-directional many-to-one association to Staff
	@OneToMany(mappedBy="branch")
	private List<StaffVO> staffs;

	//bi-directional many-to-one association to Table
	@OneToMany(mappedBy="branch")
	private List<TableVO> tables;

	public BranchVO() {
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + branchPk.intValue();
        result = prime * result + ((branchName == null) ? 0 : branchName.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof BranchVO))
            return false;
        BranchVO other = (BranchVO) obj;
        if (branchPk != other.branchPk)
            return false;
        if (branchName == null) {
            if (other.branchName != null)
                return false;
        } else if (!branchName.equals(other.branchName))
            return false;
        return true;
    }

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

	public RestaurantVO getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(RestaurantVO restaurant) {
		this.restaurant = restaurant;
	}

	public List<PromoVO> getPromos() {
		return promos;
	}

	public void setPromos(List<PromoVO> promos) {
		this.promos = promos;
	}

	public List<StaffVO> getStaffs() {
		return staffs;
	}

	public void setStaffs(List<StaffVO> staffs) {
		this.staffs = staffs;
	}

	public List<TableVO> getTables() {
		return tables;
	}

	public void setTables(List<TableVO> tables) {
		this.tables = tables;
	} 
}
