package com.nani.java.scanner;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ScannerDemo {

	public static void main(String[] args) {

		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.next());
		//int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = num1+num2;
		double num = sqrt(num1);
		double p =pow(num1, num2);
		System.out.println("sum is:"+result);
		System.out.println("square root of num1: "+num);
		System.out.println("power of two numbers:"+p);
	}

}
