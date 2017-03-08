package org.lma.enterprise.facade;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.branch.BranchBSi;
import org.lma.enterprise.bs.cart.CartBSi;
import org.lma.enterprise.bs.order.OrderBSi;
import org.lma.enterprise.bs.product.ProductBSi;
import org.lma.enterprise.bs.profile.ProfileBSi;
import org.lma.enterprise.bs.promo.PromoBSi;
import org.lma.enterprise.bs.reservation.ReservationBSi;
import org.lma.enterprise.bs.restaurant.RestaurantBSi;
import org.lma.enterprise.bs.staff.StaffBSi;
import org.lma.enterprise.bs.table.TableBSi;
import org.lma.enterprise.bs.test.TestBSi;
import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.util.transformers.BranchTransformer;
import org.lma.enterprise.util.transformers.CartTransformer;
import org.lma.enterprise.util.transformers.OrderTransformer;
import org.lma.enterprise.util.transformers.ProductTransformer;
import org.lma.enterprise.util.transformers.ProfileTransformer;
import org.lma.enterprise.util.transformers.PromoTransformer;
import org.lma.enterprise.util.transformers.ReservationTransformer;
import org.lma.enterprise.util.transformers.RestaurantTransformer;
import org.lma.enterprise.util.transformers.StaffTransformer;
import org.lma.enterprise.util.transformers.TableTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("facade")
@ComponentScan(basePackages = "org.lma.enterprise")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = ExceptionService.class) 
public class Facade implements Facadei, Serializable{
	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(Facade.class);
	
	private TestBSi testBS;
	private BranchBSi branchBS;
	private CartBSi cartBS;
	private OrderBSi orderBS;
	private ProductBSi productBS;
	private ProfileBSi profileBS;
	private PromoBSi promoBS;
	private ReservationBSi reservationBS;
	private RestaurantBSi restaurantBS;
	private StaffBSi staffBS;
	private TableBSi tableBS;
	
	private BranchTransformer branchTransformer = new BranchTransformer();
	private CartTransformer cartTransformer = new CartTransformer();
	private OrderTransformer orderTransformer = new OrderTransformer();
	private ProductTransformer productTransformer = new ProductTransformer();
	private ProfileTransformer profileTransformer = new ProfileTransformer();
	private PromoTransformer promoTransformer = new PromoTransformer();
	private ReservationTransformer reservationTransformer = new ReservationTransformer();
	private RestaurantTransformer restaurantTransformer = new RestaurantTransformer();
	private StaffTransformer staffTransformer = new StaffTransformer();
	private TableTransformer tableTransformer = new TableTransformer();
	
	/**
	 * Retrieves a Test Message
	 * 
	 * @return
	 * @throws ExceptionService
	 */
	public String retrieveMessage()throws ExceptionService{
		LOGGER.debug("Inside the Facade");
		return testBS.retrieveMessage();
	}
	
	/* Dependencies */
	
	@Autowired
    public void setTestBS(TestBSi testBS) {
		LOGGER.debug("Injecting Test BS: " + testBS);
        this.testBS = testBS;
    }

	@Autowired
	public void setBranchBS(BranchBSi branchBS) {
		LOGGER.debug("Injecting Branch BS: " + branchBS);
		this.branchBS = branchBS;
	}

	@Autowired
	public void setCartBS(CartBSi cartBS) {
		LOGGER.debug("Injecting Cart BS: " + cartBS);
		this.cartBS = cartBS;
	}

	@Autowired
	public void setOrderBS(OrderBSi orderBS) {
		LOGGER.debug("Injecting Order BS: " + orderBS);
		this.orderBS = orderBS;
	}

	@Autowired
	public void setProductBS(ProductBSi productBS) {
		LOGGER.debug("Injecting Product BS: " + productBS);
		this.productBS = productBS;
	}

	@Autowired
	public void setProfileBS(ProfileBSi profileBS) {
		LOGGER.debug("Injecting Profile BS: " + profileBS);
		this.profileBS = profileBS;
	}

	@Autowired
	public void setPromoBS(PromoBSi promoBS) {
		LOGGER.debug("Injecting Promo BS: " + promoBS);
		this.promoBS = promoBS;
	}

	@Autowired
	public void setReservationBS(ReservationBSi reservationBS) {
		LOGGER.debug("Injecting Reservation BS: " + reservationBS);
		this.reservationBS = reservationBS;
	}

	@Autowired
	public void setRestaurantBS(RestaurantBSi restaurantBS) {
		LOGGER.debug("Injecting Restaurant BS: " + restaurantBS);
		this.restaurantBS = restaurantBS;
	}

	@Autowired
	public void setStaffBS(StaffBSi staffBS) {
		LOGGER.debug("Injecting Staff BS: " + staffBS);
		this.staffBS = staffBS;
	}

	@Autowired
	public void setTableBS(TableBSi tableBS) {
		LOGGER.debug("Injecting Table BS: " + tableBS);
		this.tableBS = tableBS;
	}
	
}
