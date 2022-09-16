package FlowControl;

public class SwitchCase1 {

	public static void main(String[] args) {

		int a =40;
		final int b=40;
		switch (a) {
		case 10:
			System.out.println("case 10");
			break;
			
		case 20:
			System.out.println("case 20");
			break;
			
		case 30:
			System.out.println("case 30");
			break;
		
		case b:
			System.out.println("case 40");
			break;

		default:
			System.out.println("no matches");
			break;
		}
	}

}
