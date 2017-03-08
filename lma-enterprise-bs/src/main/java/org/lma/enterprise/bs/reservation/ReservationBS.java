package org.lma.enterprise.bs.reservation;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.BS;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("reservationBS")
@ComponentScan(basePackages = "org.lma.enterprise")
public class ReservationBS extends BS implements ReservationBSi{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ReservationBS.class);
}
