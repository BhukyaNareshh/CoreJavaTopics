package FlowControl;

import java.util.Scanner;

public class LoopAssinment {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = input.nextInt();

		// for loop
		for (int i = 1; i <= n; i++) {
			if (i % 10 == 0) {
				continue;
			}
			if (i > 100) {
				break;
			}
			System.out.println(i);
		}

		// while loop
		int i = 1;
		while (i <= n) {
			if (i % 10 == 0) {
				i++;
				continue;
			}
			if (i > 100) {
				break;
			}
			System.out.println(i++);

		}

		// do while
		 i = 1;

		do {
			if (i % 10 == 0) {
				i++;
				continue;
			}
			if (i > 100) {
				break;
			}
			System.out.println(i++);
		} while (i <= n);

	}
}
