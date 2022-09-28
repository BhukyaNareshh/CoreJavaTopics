package com.multithreading;

import java.util.Scanner;

public class ThreadJoin extends Thread {
	static int n, sum = 0;

	public static void main(String[] args) throws InterruptedException {
		Long start = System.currentTimeMillis();
		System.out.println("Sum of first 'N' numbers");
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		ThreadJoin.n = scanner.nextInt();
		ThreadJoin tj = new ThreadJoin();
		tj.start();
		
		tj.join();
		
		System.out.println("sum of first " + ThreadJoin.n +" numbers is "+ThreadJoin.sum);
		Long end = System.currentTimeMillis();
		System.out.println("Total time taken is "+ (end-start)/1000 + " seconds");
	}

	public void run() {
		for (int i = 1; i <= ThreadJoin.n; i++) {
			ThreadJoin.sum = i + ThreadJoin.sum;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("child thread exiting");
			}
		}
	}

}
