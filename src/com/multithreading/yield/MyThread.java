package com.multithreading.yield;

public class MyThread extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("child thread");
			Thread.yield();
		}
	}
}
