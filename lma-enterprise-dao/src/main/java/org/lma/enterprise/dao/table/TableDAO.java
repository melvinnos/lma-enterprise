package org.lma.enterprise.dao.table;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.dao.DAO;
import org.lma.enterprise.util.model.vo.TableVO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository("tableDAO")
@ComponentScan(basePackages = "org.lma.enterprise")
public class TableDAO extends DAO<TableVO> implements TableDAOi, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(TableDAO.class);
}
