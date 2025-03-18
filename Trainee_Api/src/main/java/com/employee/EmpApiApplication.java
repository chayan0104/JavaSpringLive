package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.employee.config.*;

@SpringBootApplication
public class EmpApiApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmpApiApplication.class, args);
		AppDetails app= context.getBean(AppDetails.class);
		System.out.println(app.appDetails());
	}

}
