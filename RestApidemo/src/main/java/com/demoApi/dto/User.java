package com.demoApi.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class User {

	@Value("${spring.application.name}")
	private String appname;

	@Value("${server.port}")
	private String server;

	public String getAppDetails() {
		return appname + " on port " + server;
	}
 
	private String name;
	private String email;
	private String mobile;
	private String pass;
}
