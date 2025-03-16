package com.demoApi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration // Indicates that this class is a configuration class for Spring
public class ObjectMapperConfig {
    
    // Defines a Bean for ObjectMapper, which is a Jackson utility for JSON processing
    @Bean 
     ObjectMapper objectmapper(){
        // Create and return a new ObjectMapper instance
        return new ObjectMapper();
    }
}
