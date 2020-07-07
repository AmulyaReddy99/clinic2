package com.example.demo.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("/")
	public String hello() {
		return "Successful";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "Admin";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "User";
	}
		
}
