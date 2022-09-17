package com.inheritance;

public class Child extends Parent {
	public Child() {
		System.out.println("child object" + this);
	}

	void f1() {
		System.out.println("inside child");
	}

}
