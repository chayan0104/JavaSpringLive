package com.demoApi.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

//	    http://localhost:7473/api/v1/user/register?name=ram
//	    protocol+host+ port- http://localhost:7473/
//		base url-api/v1/user
//		endpoint url-/register
//		query-name=ram

	String regex = "^[a-zA-Z]+$";

	// getting the query data with the help of @requestparam
	@PostMapping("/register")
	public String userRegister(@RequestParam(name = "uname") String userName,
			@RequestParam(name = "pass") String pass) {

		if (userName == null || userName.trim().isEmpty()) {
			return "Enter A valid name!";
		}
		if (!userName.matches(regex)) {
			return "Enter A valid name!";
		} else {
			return "Hello there, " + userName + " and password is:" + pass;
		}
	}

	// Another way direct
	@PostMapping("/register2")
	public String userRegister2(@RequestParam String userName, @RequestParam String pass) {
		return "Hello there, " + userName + " and password is:" + pass;
	}

	// With the use of map
	@PostMapping("/register3")
	public String userRegister3(@RequestParam Map<String, String> params) {
		String userName = params.get("uname");
		String pass = params.get("pass");
		
		return "Hello there, " + userName + " and password is:" + pass;
//		return params.entrySet().toString();
	}
}
