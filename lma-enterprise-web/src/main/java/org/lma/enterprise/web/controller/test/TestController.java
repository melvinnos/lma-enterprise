package org.lma.enterprise.web.controller.test;


import java.io.Serializable;

import org.apache.log4j.Logger;
import org.lma.enterprise.bs.test.TestBSi;
import org.lma.enterprise.dao.test.TestDAOi;
import org.lma.enterprise.exception.ExceptionService;
import org.lma.enterprise.facade.Facadei;
import org.lma.enterprise.web.controller.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * http://localhost:8080/lma-enterprise-web/
 * 
 * @author agustin.hernandez
 *
 */
@Controller("testController")
@ComponentScan(basePackages = "org.lma.enterprise")
public class TestController extends Action implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logger.getLogger(TestController.class);
	
	@Autowired
	private Facadei facade;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		LOGGER.debug("index()");
		return "redirect:/users";
	}
	
	// list page
		@RequestMapping(value = "/users", method = RequestMethod.GET)
		public String showAllUsers(Model model) {
			String rt = new String("users/list");
			String message;
			
			try{
				message = facade.retrieveMessage();
				model.addAttribute("msg", message);
				
				LOGGER.debug(message);
			}catch(ExceptionService e){
				LOGGER.error(e.getMessage());
				model.addAttribute("msg", "Injection Error");
			}catch(Exception e){
				LOGGER.error(e.getMessage());
				model.addAttribute("msg", "Injection Error");
			}
			
			return rt;
		}
}
