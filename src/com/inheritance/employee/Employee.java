package com.inheritance.employee;

public class Employee {
	long id;
	String name;
	String department;
	Double salary;

	public Employee(long id, String name, String department, Double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	protected void work() {
		System.out.println("common work for everyone");
		
	}

}
