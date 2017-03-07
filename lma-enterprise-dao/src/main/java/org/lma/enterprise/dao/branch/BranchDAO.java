package org.lma.enterprise.dao.branch;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.dao.DAO;
import org.lma.enterprise.util.model.vo.BranchVO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository("branchDAO")
@ComponentScan(basePackages = "org.lma.enterprise")
public class BranchDAO extends DAO<BranchVO> implements BranchDAOi, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(BranchDAO.class);
}
