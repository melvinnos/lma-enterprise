package org.lma.enterprise.dao.profile;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.dao.DAO;
import org.lma.enterprise.util.model.vo.ProfileVO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository("profileDAO")
@ComponentScan(basePackages = "org.lma.enterprise")
public class ProfileDAO extends DAO<ProfileVO> implements ProfileDAOi, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ProfileDAO.class);
}
