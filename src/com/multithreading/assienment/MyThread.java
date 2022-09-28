package com.multithreading.assienment;

public class MyThread {

	public static void main(String[] args) {

		EvenNumberThread ev = new EvenNumberThread();
		OddNumberThread od = new OddNumberThread();
		ev.start();
		od.start();
	}

}
