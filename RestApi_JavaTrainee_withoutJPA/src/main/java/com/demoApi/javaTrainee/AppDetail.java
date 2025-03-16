package com.demoApi.javaTrainee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class AppDetail {

	@Value("${spring.application.name}")
	private String appName;

	@Value("${server.port}")
	private String portNumber;

	public String appDetails() {
		return appName + " is running on:" + portNumber;
	}

}
