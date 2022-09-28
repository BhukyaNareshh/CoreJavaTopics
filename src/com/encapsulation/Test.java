package com.encapsulation;

public class Test {

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.setFirstName("naresh");
		c1.setLastName("bhukya");
		c1.setCreditCard("12345");
		
		System.out.println("firstname:"+c1.getFirstName());
		System.out.println("lastname:"+c1.getLastName());
		System.out.println("creditcard:"+c1.getCreditCard());
		
	}

}
