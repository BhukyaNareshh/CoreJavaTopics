package com.multithreading;

public class MultiThreading extends Thread{

	public static void main(String[] args) {
		MultiThreading mt = new MultiThreading();
		mt.start();
		Thread currentThread = Thread.currentThread();
		
		System.out.println("Thread name is "+currentThread.getName());
		
		for (int j = 1; j <= 200; j++) {
			System.out.print("j: " + j + "\t");
		}
	}

	public void run() {
		Thread currentThread = Thread.currentThread();
		currentThread.setName("print 200 numbers: ");
		System.out.println("Thread name: "+currentThread.getName());
		for (int i = 1; i <= 200; i++) {
			System.out.print("i: " + i + "\t");
		}
	}

}
