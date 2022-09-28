package com.multithreading.synchronization;

public class DisplayMessage {
	public synchronized void sayHello(String name) {
		for(int i=1;i<=5;i++) {
			System.out.println("how are you "+ name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
