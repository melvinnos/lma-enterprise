package org.lma.enterprise.bs.profile;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.BS;
import org.lma.enterprise.dao.profile.ProfileDAOi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service("profileBS")
@ComponentScan(basePackages = "org.lma.enterprise")
public class ProfileBS extends BS implements ProfileBSi{

	@Autowired
	private ProfileDAOi profileDAO;
	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ProfileBS.class);
}
