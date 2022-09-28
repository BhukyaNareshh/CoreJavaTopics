package com.multithreading.deadlock;

public class FirstResource {

	public synchronized void method1(SecondResource sr) {
		System.out.println("inside method1 of FR");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("invoking method2 of SR");
		sr.method2();
		
	}
	
	public synchronized void method2() {
		System.out.println("inside method2 of FR");
		
	}
}
