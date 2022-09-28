package com.inheritance.employee;

public class Tester extends Employee {
	String[] tools;

	public Tester(long id, String name, String department, Double salary, String[] tools) {
		super(id, name, department, salary);
		this.tools=tools;
		
	}
	
	@Override
	protected void work() {
		super.work();
		System.out.println("tester is testing using");
		for (int i =0;i<tools.length;i++) {
			System.out.println(tools[i]);
		}
		
	}

}
