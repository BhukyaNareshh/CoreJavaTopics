package com.multithreading.synchronization;

public class synchronizationDemo {

	public static void main(String[] args) {

		DisplayMessage dm = new DisplayMessage();
		MyThread t1 = new MyThread(dm, "nani");
		MyThread t2 = new MyThread(dm, "naresh");
		t1.start();
		t2.start();
	}

}
