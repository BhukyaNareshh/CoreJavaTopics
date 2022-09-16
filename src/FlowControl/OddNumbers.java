package FlowControl;

public class OddNumbers {

	public static void main(String[] args) {

		System.out.println("odd numbers");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("Even numbers");
		for (int j=1;j<10;j++) {
			if(j%2 != 0) {
				continue;
			}System.out.println(j);
		}
		
	}

}
