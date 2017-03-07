package org.lma.enterprise.util.model.to;

public class RestaurantTO extends TO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	 
    private String name;
 
    private String logo;
    
    private String foodType;

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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
}
