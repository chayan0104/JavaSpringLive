package com.employee.trainee;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "employee_details")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EmpDto {

	@JsonIgnore
	private int id;
	private String name;
	private String  email;
	private String  city;
	private String  skill;
	private long mobileNo;
}
