package com.cricket.ipl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.ipl.user.UserEntity;

//@Controller //is typically used for traditional MVC-based web applications,to return views.
@RestController // it is used for RESTful APIs(Controller + ResponseBody),returns json/xml  format.
@RequestMapping("/test/api")  //base url
public class TestController {

//    @RequestMapping(path = "/hello",method = RequestMethod.GET)

	@GetMapping("/hello") // @ResponseBody //will return as string format public
	Map<String, String> sayHello() {
		Map<String, String> response = new HashMap<String, String>();
		response.put("message", "Hello folks!");
		response.put("status", "success");
		return response; // This will be automatically converted to JSON
	}

	@GetMapping("/user1")
	public Map<Integer, String> user1() {
		Map<Integer, String> emp = new HashMap<>();
		emp.put(1, "Chayan");
		emp.put(2, "Samanta");
		return emp;
	}
	
	@GetMapping("/user")
	public UserEntity getUser() {
	    UserEntity user = new UserEntity(1,"chayan samanta");
	    return user; 
	}

	
	
}
