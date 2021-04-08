package com.rezg.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@GetMapping(value ="/welcome")
	public String welcomeMessgae() {
		
		logger.debug("tesing debug");
		logger.info("tesing info");
		logger.warn("tesing warn");
		
		return "Hello World";
	}

}
