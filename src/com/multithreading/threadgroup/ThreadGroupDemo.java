package com.multithreading.threadgroup;

public class ThreadGroupDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		
		ThreadGroup parent = new ThreadGroup("parent");
		System.out.println(parent.getName());
		ThreadGroup child = new ThreadGroup(parent, "child");
		System.out.println(child.getName());
		child.setMaxPriority(3);
		Thread thread1 = new Thread(child, "thread1");
		Thread thread2 = new Thread(child, "thread2");
		
		child.setMaxPriority(5);
		Thread thread3 = new Thread(child, "thread3");
		
		
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
		System.out.println(thread3.getPriority());
	}

}
