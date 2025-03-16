package com.demoApi.javaTrainee;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "trainee_data")
public class JavaTraineeDTO {
	@JsonIgnore
	private int id;
	private String name, email;
	private long mobile;

}
