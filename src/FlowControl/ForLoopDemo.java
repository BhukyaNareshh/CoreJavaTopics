package FlowControl;

public class ForLoopDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			if(i==10) {
				break;
			}
			System.out.println(i);
		}
	}

}
