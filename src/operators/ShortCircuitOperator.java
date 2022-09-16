package operators;

public class ShortCircuitOperator {

	public static void main(String[] args) {

		boolean x = false, y = false;
		
		if(x||y) {
			System.out.println("inside true");
		}else {
			System.out.println( "outside false");
		}
	}

}
