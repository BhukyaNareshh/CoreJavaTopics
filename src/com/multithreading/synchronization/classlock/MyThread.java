package com.multithreading.synchronization.classlock;

public class MyThread extends Thread {

	String name;

	public MyThread(String name) {
		this.name = name;
	}

	public void run() {
		DisplayMessage.sayHello(name);

	}
}
