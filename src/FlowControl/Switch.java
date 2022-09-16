package FlowControl;

public class Switch {

	public static void main(String[] args) {

		String choice = "withdraw cash";

		switch (choice) {
		case "check balance":
			System.out.println("check balance");
			break;

		case "deposit cash":
			System.out.println("deposit cash");
			break;
			
		case "available balance":
			System.out.println("available balance");

		case "change pin":
			System.out.println("change pin");
			break;

		case "withdraw cash":
			System.out.println("withdraw cash");
			break;

		default:
			System.out.println("timeout");
		}

	}

}
