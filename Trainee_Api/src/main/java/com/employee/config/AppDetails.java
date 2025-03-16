package com.employee.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class AppDetails {
	
	@Value("${spring.application.name}")
	private String appName;
	
	@Value("${server.port}")
	private String portNo;
	
	public String appDetails() {
		return appName + " is running on:" + portNo;
	}
}
