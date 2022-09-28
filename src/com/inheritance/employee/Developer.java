package com.inheritance.employee;

public class Developer extends Employee {
	String technologies;

	public Developer(long id, String name, String department, Double salary, String technologies) {
		super(id, name, department, salary);
		this.technologies = technologies;
	}

	@Override
	protected void work() {
		super.work();
		System.out.println("developer is working using "+ technologies);
	}

}
