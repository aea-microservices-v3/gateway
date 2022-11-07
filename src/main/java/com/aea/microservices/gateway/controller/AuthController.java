package com.aea.microservices.gateway.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aea.microservices.gateway.model.User;

@RestController
@RequestMapping("/auth")
public class AuthController
{
	
	private static Logger LOG = LoggerFactory.getLogger(AuthController.class);

	@PostMapping("/authenticate")
	public String authenticate(@RequestBody final User user)
	{
		LOG.info("Authenticating user : {}", user.getUsername());
		return "Authentication successful";
	}
	
}
