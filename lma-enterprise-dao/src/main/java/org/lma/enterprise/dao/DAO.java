package org.lma.enterprise.dao;


/*
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.StandardBasicTypes;
import org.lma.enterprise.util.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
*/
public class DAO implements DAOi{
	/*
	@Autowired
    private SessionFactory sessionFactory;
 
    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
 
    public void persist(Object entity) {
        getSession().persist(entity);
    }
 
    public void delete(Object entity) {
        getSession().delete(entity);
    }
    
    public Integer getNext(Sequence seq){
    	
    	StringBuilder querySB = new StringBuilder();
    	
    	querySB.append("select ").append(seq.getSequence()).append(".nextval as num from dual");
    	
    	Query query = getSession().createSQLQuery(querySB.toString()).
    			addScalar("num", StandardBasicTypes.INTEGER);

    	return (Integer)query.uniqueResult();
    }*/
}
