package com.tutorialspoint.projects.googleservice.config;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Configuration {
	@RequestMapping(value = "/user")
	   public Principal user(Principal principal) {
	      return principal;
	   }

}
