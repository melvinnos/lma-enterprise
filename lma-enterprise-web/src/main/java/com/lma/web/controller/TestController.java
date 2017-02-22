package com.lma.web.controller;


import org.apache.log4j.Logger;
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
@Controller
public class TestController {

	private static final Logger LOGGER = Logger.getLogger(TestController.class);
	
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
