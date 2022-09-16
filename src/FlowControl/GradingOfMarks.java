package FlowControl;

public class GradingOfMarks {

	public static void main(String[] args) {
		int maths = 56;
		int physics = 20;
		int chemistry = 80;
		double average = maths + physics + chemistry / 3;

		if (maths < 35 || physics < 35 || chemistry < 35) {
			System.out.println("fail");
		} else if (average <= 59) {
			System.out.println("C Grade");
		} else if (average <= 69) {
			System.out.println("B Grade");
		} else {
			System.out.println("A Grade");
		}

	}
}
