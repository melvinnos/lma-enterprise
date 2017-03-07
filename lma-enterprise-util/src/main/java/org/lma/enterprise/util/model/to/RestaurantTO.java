package org.lma.enterprise.util.model.to;

public class RestaurantTO extends TO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long restaurantPk;

	private String restaurantFoodtype;

	private String restaurantLogo;

	private String restaurantName;

	public Long getRestaurantPk() {
		return restaurantPk;
	}

	public void setRestaurantPk(Long restaurantPk) {
		this.restaurantPk = restaurantPk;
	}

	public String getRestaurantFoodtype() {
		return restaurantFoodtype;
	}

	public void setRestaurantFoodtype(String restaurantFoodtype) {
		this.restaurantFoodtype = restaurantFoodtype;
	}

	public String getRestaurantLogo() {
		return restaurantLogo;
	}

	public void setRestaurantLogo(String restaurantLogo) {
		this.restaurantLogo = restaurantLogo;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
}
