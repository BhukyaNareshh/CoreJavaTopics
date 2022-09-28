package com.multithreading.yield;

public class YieldDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("main thread");
		}
	}

}
