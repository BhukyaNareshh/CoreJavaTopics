package com.multithreading.threadgroup;

public class CustomThread extends Thread {
	public CustomThread(ThreadGroup g,String name) {
		super(g,name);
	}
	@Override
	public void run() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
