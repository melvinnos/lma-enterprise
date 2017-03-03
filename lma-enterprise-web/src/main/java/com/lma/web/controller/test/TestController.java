package com.lma.web.controller.test;


import org.apache.log4j.Logger;
import org.lma.enterprise.facade.Facadei;
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
@ComponentScan(basePackages = "org.lma.enterprise.facade")
public class TestController {

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
			
			LOGGER.debug("showAllUsers()");
			
			return rt;
		}
}
