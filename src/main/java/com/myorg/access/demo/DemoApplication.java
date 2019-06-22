package com.myorg.access.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	
	@GetMapping("/")
	public String welcome()
	{
		return "Welcome to Microservice on openshift";
	}
	@GetMapping("/{username}")
	public String welcome(@PathVariable String username)
	{
		return "Hi "+username+"Welcome to the application you have successfully login into microservice";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
