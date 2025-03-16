package com.employee.Trainee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employee_details")
public class EmpEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY.AUTO)
	@Column(name="empid",nullable = false,unique = true,length = 100)
	private int id;
	
	@Column(nullable = false,length = 100)
	private String name, email, city, skill;
	
	@Column(name="MobileNumber",nullable = false,unique = true)
	private long mobileNo;
}
