package com.demoApi.javaTrainee;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "trainee_data")
public class JavaTraineeDTO {
	
	private String name, email, mobile;

}
