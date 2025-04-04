package com.demoApi.javaTrainee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "trainee_data")
public class JavaTraineeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //generates automatically
	private int id;
	@Column
	private String name, email;
	@Column
	private long mobile;

}
