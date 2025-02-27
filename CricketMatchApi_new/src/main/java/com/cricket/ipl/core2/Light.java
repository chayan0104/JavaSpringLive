package com.cricket.ipl.core2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Light {
	
//	@Bean
	public String getLight() {
		
		return "100 Watt";
	}

}
