package com.multithreading.synchronization.classlock;

public class synchronizationDemo {

	public static void main(String[] args) {

		MyThread t1 = new MyThread( "nani");
		MyThread t2 = new MyThread("naresh");
		t1.start();
		t2.start();
	}

}
