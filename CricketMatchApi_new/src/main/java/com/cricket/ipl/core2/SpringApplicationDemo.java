package com.cricket.ipl.core2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringApplicationDemo {


    public static void main(String[] args) {
    	ApplicationContext context = SpringApplication.run(SpringApplicationDemo.class, args);

    	BulbService bulbService = context.getBean(BulbService.class);
    	System.out.println(bulbService.askBulb());
    	System.out.println(bulbService.aboutLight());
      
    }
}
