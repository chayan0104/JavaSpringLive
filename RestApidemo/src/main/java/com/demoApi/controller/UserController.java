package com.demoApi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/v1/user")
public class UserController {
	
	@PostMapping("/register")
	public String userRegister() {
		return"";
	}

}
