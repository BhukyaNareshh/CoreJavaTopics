package com.multithreading.interrupt;

public class MyThread extends Thread {

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("I a lazy thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Got interrupted");
		}
	}
}
