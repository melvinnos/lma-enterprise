package org.lma.enterprise.dao;

import java.io.Serializable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.StandardBasicTypes;
import org.lma.enterprise.exception.ExceptionDao;
import org.lma.enterprise.util.Sequence;
import org.springframework.beans.factory.annotation.Autowired;

public class DAO<CLAZZ extends Serializable> implements DAOi<CLAZZ>{
	
	@Autowired
    private SessionFactory sessionFactory;
 
    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
 
    /**
	 * Inserts a new VO.
	 * 
	 * @param vo
	 * @return CLAZZ
	 * @throws ExceptionDAO
	 */
	public CLAZZ insert(CLAZZ vo) throws ExceptionDao{
		
		try{
			getSession().persist(vo);
		}catch(Exception e){
			throw new ExceptionDao(e.getMessage());
		}
		
		return vo;
	}
    
	/**
	 * Deletes a VO.
	 * 
	 * @param vo
	 * @throws ExceptionDao
	 */
	public void delete(CLAZZ vo) throws ExceptionDao{
		try{
			getSession().delete(vo);
		}catch(Exception e){
			throw new ExceptionDao(e.getMessage());
		}
	}
	
	/*
    public void persist(Object entity) {
        getSession().persist(entity);
    }
 
    public void delete(Object entity) {
        getSession().delete(entity);
    }*/
    
    public Integer getNext(Sequence seq){
    	
    	StringBuilder querySB = new StringBuilder();
    	
    	querySB.append("select ").append(seq.getSequence()).append(".nextval as num from dual");
    	
    	Query query = getSession().createSQLQuery(querySB.toString()).
    			addScalar("num", StandardBasicTypes.INTEGER);

    	return (Integer)query.uniqueResult();
    }
}
