package com.multithreading.synchronization.blocks;

public class DisplayMessage {
	public void sayHello(String name) {
		
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println("how are you " + name);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
