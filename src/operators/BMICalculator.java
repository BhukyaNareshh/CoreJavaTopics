package operators;

public class BMICalculator {

	public static void main(String[] args) {

		//BMI =weight(kg)/height*height(mts)
		
		double height =5.8*0.3048;
		double weight = 72.50;
		double bmi = weight/height*height;
		System.out.println("BMI "+ bmi );
		
		int i=10;
		System.out.println(++i);
		
	}

}
