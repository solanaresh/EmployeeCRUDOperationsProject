package com.tutorialspoint.projects.googleservice;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = {
"com.tutorialspoint.projects.googleservice.config"})
public class GoogleserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleserviceApplication.class, args);
	}
	 
}
