package com.demoApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.demoApi.dto.User;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class RestApidemoApplication {

    public static void main(String[] args) {
        // Start the Spring Boot application and get the application context
        ApplicationContext context = SpringApplication.run(RestApidemoApplication.class, args);

        // Get the User bean from the application context
        User user = context.getBean(User.class);

        // Print out the application name (from User DTO)
        System.out.println("Running : " + user.getAppDetails());
    }
}
