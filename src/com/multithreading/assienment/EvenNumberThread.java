package com.multithreading.assienment;

public class EvenNumberThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
