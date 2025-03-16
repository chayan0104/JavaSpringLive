package com.employee.Trainee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "employee_details")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EmpDto {

	private int id;
	private String name, email, city, skill;
	private long mobileNo;
}
