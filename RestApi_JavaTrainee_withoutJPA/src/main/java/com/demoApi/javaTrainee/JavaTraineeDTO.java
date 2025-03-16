package com.demoApi.javaTrainee;

import com.fasterxml.jackson.annotation.JsonIgnore;  // Import for JSON serialization control
import jakarta.persistence.Table;  // Import for JPA annotations
import lombok.Data;  // Import for Lombok to generate getters, setters, equals, hash, and toString methods

@Data // Lombok annotation to automatically generate getters, setters, toString, equals, and hashCode methods
@Table(name = "trainee_data")  // JPA annotation to specify the table name in the database
public class JavaTraineeDTO {

    @JsonIgnore  // Jackson annotation to ignore this field during JSON serialization and deserialization
    private int id;  // Trainee ID, will not be included in JSON output due to @JsonIgnore
    
    private String name;  // Trainee's name
    private String email;  // Trainee's email address
    private long mobile;  // Trainee's mobile number
}
