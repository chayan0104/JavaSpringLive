package com.demoApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.demoApi.javaTrainee.AppDetail;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class RestApiMainApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(RestApiMainApplication.class, args);
		AppDetail detail = context.getBean(AppDetail.class);

		System.out.println(detail.appDetails());
	}
}
