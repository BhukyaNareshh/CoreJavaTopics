package com.inheritance;

public class Bus extends Vehicle {

	String fuel() {
		super.fuel();
		return "diesel";
	}
	
public static void main() {
	Bus b = new Bus();
	b.fuel();
	
}
}
