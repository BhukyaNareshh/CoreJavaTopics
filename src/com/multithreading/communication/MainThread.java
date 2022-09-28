package com.multithreading.communication;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

		MyThread mt = new MyThread();
		mt.start();
		
		synchronized (mt) {
			System.out.println("main thread is going to wait");
			mt.wait();
			System.out.println("main thread notified");
			System.out.println(mt.total);
		}
	}

}
