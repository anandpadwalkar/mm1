/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampuspresentation.authentication;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iitms.rfcampusdata.authentication.entity.MenuMasterEntity;
import com.iitms.rfcampusdomain.authentication.service.MenuService;
import com.iitms.rfcampusdomain.authentication.service.ModuleService;

@Controller
public class TestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private MenuService menuService;
	@Autowired
	//private ModuleService moduleService;
	
	
	@RequestMapping(value = "/menus")
	public @ResponseBody List<MenuMasterEntity> getMenus(){
		return menuService.getMenuList(1);
	}
	
	@RequestMapping(value = "/testing", method = RequestMethod.POST)
	public String testing(@RequestParam(required = false, defaultValue = "0") int check){
		LOGGER.info("Param : "+ check);
		return "test";
	}
	@RequestMapping(value = "/testing", method = RequestMethod.GET)
	public String testing1(){
		
		return "test";
	}
}
