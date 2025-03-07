package com.demoApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class RestApidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApidemoApplication.class, args);
//		ApplicationContext context = SpringApplication.run(RestApidemoApplication.class, args);

//		UserController usc = context.getBean(UserController.class);

		System.out.println("api running");
	}

}
