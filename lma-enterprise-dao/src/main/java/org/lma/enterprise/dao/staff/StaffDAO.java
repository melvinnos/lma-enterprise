package org.lma.enterprise.dao.staff;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.dao.DAO;
import org.lma.enterprise.util.model.vo.StaffVO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository("staffDAO")
@ComponentScan(basePackages = "org.lma.enterprise")
public class StaffDAO extends DAO<StaffVO> implements StaffDAOi, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(StaffDAO.class);
}
