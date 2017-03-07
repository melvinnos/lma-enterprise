package org.lma.enterprise.util.model.vo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.dom4j.Branch;
 
@Entity
@Table(name="RESTAURANT")
public class RestaurantVO implements Serializable{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RESTAURANT_PK")
	private Long restaurantPk;

	@Column(name="RESTAURANT_FOODTYPE")
	private String restaurantFoodtype;

	@Column(name="RESTAURANT_LOGO")
	private String restaurantLogo;

	@Column(name="RESTAURANT_NAME")
	private String restaurantName;

	//bi-directional many-to-one association to Branch
	@OneToMany(mappedBy="restaurant")
	private List<Branch> branches;

	public RestaurantVO() {
	}

	public Long getRestaurantPk() {
		return this.restaurantPk;
	}

	public void setRestaurantPk(Long restaurantPk) {
		this.restaurantPk = restaurantPk;
	}

	public String getRestaurantFoodtype() {
		return this.restaurantFoodtype;
	}

	public void setRestaurantFoodtype(String restaurantFoodtype) {
		this.restaurantFoodtype = restaurantFoodtype;
	}

	public String getRestaurantLogo() {
		return this.restaurantLogo;
	}

	public void setRestaurantLogo(String restaurantLogo) {
		this.restaurantLogo = restaurantLogo;
	}

	public String getRestaurantName() {
		return this.restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public List<Branch> getBranches() {
		return this.branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + restaurantPk.intValue();
        result = prime * result + ((restaurantName == null) ? 0 : restaurantName.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof RestaurantVO))
            return false;
        RestaurantVO other = (RestaurantVO) obj;
        if (restaurantPk != other.restaurantPk)
            return false;
        if (restaurantName == null) {
            if (other.restaurantName != null)
                return false;
        } else if (!restaurantName.equals(other.restaurantName))
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return "Restaurant [restaurantPk=" + restaurantPk + ", name=" + restaurantName + "]";
    }   
 
}
