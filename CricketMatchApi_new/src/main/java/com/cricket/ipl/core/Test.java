package com.cricket.ipl.core;

public class Test {

	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.setId(11);
		emp.setName("Rama");

		Address addrs = new Address();
		addrs.setCountry("India");
		addrs.setCity("Kolkata");
		addrs.setPin(700156);

		System.out.println("Employee Details:");
		System.out.println("Employee ID: " + emp.getId());
		System.out.println("Employee Name: " + emp.getName());
		
		System.out.println("\nAddress Details:");
		System.out.println("Country: " + addrs.getCountry());
		System.out.println("City: " + addrs.getCity());
		System.out.println("Pin: " + addrs.getPin());
	}
}
