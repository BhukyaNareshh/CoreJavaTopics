package com.inheritance.employee;

public class Test {

	public static void main(String[] args) {

	String[] projects = new String[] {"Flight Reservation","checkin"};
	Manager manager = new Manager(101, "nani", "travel", 1000.00, projects,2000.00); 
	System.out.println(manager.id);
	System.out.println(manager.name);
	System.out.println(manager.department);
	System.out.println(manager.salary);
	manager.work();
	
	Developer developer = new Developer(102, "jhon", "javafullstack developer", 10000.00, "developer");
	developer.work();
	
	Tester tester = new Tester(103, "anil", "Tester", 1000.00, new String[] {"aws","devops"});
	tester.work();
				
	}

}
