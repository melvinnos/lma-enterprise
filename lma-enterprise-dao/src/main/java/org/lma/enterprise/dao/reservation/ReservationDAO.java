package org.lma.enterprise.dao.reservation;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.dao.DAO;
import org.lma.enterprise.util.model.vo.ReservationVO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository("reservationDAO")
@ComponentScan(basePackages = "org.lma.enterprise")
public class ReservationDAO extends DAO<ReservationVO> implements ReservationDAOi, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ReservationDAO.class);
}
