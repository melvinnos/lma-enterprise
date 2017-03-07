package org.lma.enterprise.util.model.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BRANCH")
public class BranchVO  implements Serializable{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "BRANCH_PK", nullable = false)
	private Integer id;
	
	@Column(name = "BRANCH_NAME", nullable = false)
    private String name;

	@Column(name = "RESTAURANT_ID", nullable = false)
    private Integer restaurantId;
    
	@Column(name = "BRANCH_ADDRESS", nullable = false)
    private String address;
    
	@Column(name = "BRANCH_PHONE", nullable = false)
    private String phone;
    
	@Column(name = "BRANCH_MAIL", nullable = true)
    private String email;
    
	@Column(name = "BRANCH_COORDINATES", nullable = true)
    private String coordinates;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return "Branch [id=" + id + ", name=" + name + ", RestaurantID=" + restaurantId+ ", address=" + address + "]";
    }   
}
