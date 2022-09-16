package FlowControl;

public class WhileDemo {

	public static void main(String[] args) {

		int x =1;
		while(x<=5) {
			System.out.println(x);
			x++;
		}
		
		
		while(true) {
			System.out.println("hello");
			break; //if we not break the loop will run infinite number of times
		}
	}

}
