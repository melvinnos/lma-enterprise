package org.lma.enterprise.bs.test;

import org.lma.enterprise.bs.BS;
import org.lma.enterprise.dao.test.TestDAOi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("TestService")
public class TestBS extends BS implements TestBSi {

	
   private TestDAOi testDao;
    
    
}
