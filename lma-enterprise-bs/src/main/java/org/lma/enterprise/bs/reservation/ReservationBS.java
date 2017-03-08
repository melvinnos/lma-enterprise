package org.lma.enterprise.bs.reservation;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.BS;
import org.lma.enterprise.dao.reservation.ReservationDAOi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("reservationBS")
@ComponentScan(basePackages = "org.lma.enterprise")
public class ReservationBS extends BS implements ReservationBSi{

	@Autowired
	private ReservationDAOi reservationDAO;
	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ReservationBS.class);
}
