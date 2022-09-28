package com.inheritance.employee;

public class Manager extends Employee {
	String[] projects;
	double salary;

	public Manager(long id, String name, String department, Double salary, String[] projects, double managerSalary) {
		super(id, name, department, salary);
		System.out.println("inside manager constructure");
		this.projects = projects;
		this.salary=managerSalary;
	}
	
	@Override
	protected void work() {
		super.work();
		System.out.println("Manager is manaing");
		for(int i = 0; i<projects.length;i++) {
			System.out.println(projects[i]);
			
		}
	}

}
