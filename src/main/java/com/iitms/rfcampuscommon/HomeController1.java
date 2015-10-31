/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampuscommon;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Handles requests for the application home page.
 */
@Component
public class HomeController1 {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController1.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/*@RequestMapping(value = "/h1", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}*/
	
}
