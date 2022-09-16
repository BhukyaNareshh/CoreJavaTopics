
public class StaticMethodsDemo {

	public static void main(String[] args) {
		StaticMethodsDemo.method1();
		System.out.println("main method");

	}

	static void method1() {
		System.out.println("inside static method1");
	}
	
	static {
		System.out.println("inside static method");
	}

}
