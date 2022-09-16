package FlowControl;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {

		System.out.println("choose one option from the list ");
		Scanner input = new Scanner(System.in);
		String choice = input.next();

		if (choice.equals("balance")) {
			System.out.println("balance - 1200");
		} else if (choice.equals("changePin")) {
			System.out.println("change pin and enter new pin");
		} else if (choice.equals("withdrawCash")) {
			System.out.println("successfully withdraw cash from the account");
		} else if (choice.equals("depositCheck")) {
			System.out.println("successfully deposited cash to the account");
		}else
		{
			System.out.println("timeout");
		}
	}

}
