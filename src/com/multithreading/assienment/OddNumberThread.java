package com.multithreading.assienment;

public class OddNumberThread extends Thread {
	public void run() {
		for (int j = 1; j <= 10; j++) {
			if (j % 2 == 0) {
				continue;
			}
			System.out.println(j);
		}
	}
}