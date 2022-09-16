package FlowControl;

import java.util.Scanner;

public class CheckPrimeNumberFromInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int checkNum = input.nextInt();
		boolean primeFlag = true;

		for (int i = 2; i <= (checkNum - 1); i++) {
			if (checkNum % i == 0) {
				primeFlag = false;
				break;
			}
		}
		if (primeFlag) {
			System.out.println(checkNum + "is a primenumber");

		} else {
			System.out.println("not a primenumber");
		}

	}

}
