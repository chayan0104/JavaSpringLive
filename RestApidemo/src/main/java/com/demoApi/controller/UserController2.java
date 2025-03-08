package com.demoApi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demoApi.dto.User;

@RestController
@RequestMapping("/test/api/userdata")
public class UserController2 {

	// Using @RequestParam
	@PostMapping("/registerdata")
	public User userData(@RequestParam String name, @RequestParam String mobile, @RequestParam String email,
			@RequestParam String pass) {
		User user = new User();
		user.setName(name);
		user.setMobile(mobile);
		user.setEmail(email);
		user.setPass(pass);
		return user;
	}

	// Using @RequestBody
	@PostMapping("/registerdata2")
	public User userData2(@RequestBody User user) {
		return user;
	}

	// Using @RequestBody and ResponseEntity
	@PostMapping("/registerdata3")
	public ResponseEntity<User> userData3(@RequestBody User user) {
//		ResponseEntity<User> entity = new ResponseEntity<>(user, HttpStatus.CREATED);

//		return ResponseEntity.ok(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
//		return entity;
	}

	// Example of @PathVariable
	@PostMapping("/registerdata3/{name}")
	public ResponseEntity<User> userData4(@PathVariable String name) {
		System.out.println(name);

		//http://localhost:7473/test/api/userdata/registerdata3/ram
		ResponseEntity<User> entity = new ResponseEntity<User>(HttpStatus.ACCEPTED);
		return entity;
	}
}
