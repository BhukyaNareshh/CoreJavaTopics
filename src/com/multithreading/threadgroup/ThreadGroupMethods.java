package com.multithreading.threadgroup;

public class ThreadGroupMethods {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup mtg = new ThreadGroup("MyThreadGroup");
		CustomThread thread1 = new CustomThread(mtg, "Thread-1");
		CustomThread thread2 = new CustomThread(mtg, "Thread-2");
		thread1.start();
		thread2.start();
		System.out.println(mtg.activeCount());
		System.out.println(mtg.activeGroupCount());
		mtg.list();

		Thread.sleep(3000);

		System.out.println(mtg.activeCount());
		mtg.list(); 
	}

}
