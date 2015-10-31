/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampuspresentation.authentication;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.iitms.rfcampusdata.authentication.entity.RoleMenuAllocation;
import com.iitms.rfcampusdata.authentication.entity.TestSession;
import com.iitms.rfcampusdomain.authentication.service.MenuService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private TestSession testSession;
	
	@RequestMapping(value = { "/", "/welcome**", "/hi" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {
	    
	    LOGGER.info("This is the User " +testSession.getUsername());
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", testSession.getUsername());
		model.setViewName("hello");
		return model;

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage()
	{
		
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page!");
		
		model.setViewName("admin");
		
		return model;

	}
	
	@RequestMapping(value = { "/menu" }, method = RequestMethod.GET)
	public @ResponseBody List<RoleMenuAllocation> welcomePage1(HttpServletRequest rquest) throws IOException {
		
		List<RoleMenuAllocation> role =menuService.getMenuOfRole(testSession.getRoleId());
		
		
		LOGGER.info("Menus : " + role.size());
		return role;

	}
	
	@RequestMapping(value = { "/test" }, method = RequestMethod.GET)
	public String test(HttpServletRequest request) throws IOException {
	    
	    return "new-group-add-staf-list";

	}
}
