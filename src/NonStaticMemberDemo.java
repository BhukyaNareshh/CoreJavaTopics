
public class NonStaticMemberDemo {

	int num;

	NonStaticMemberDemo() {
		System.out.println("constructor");
	}
	
	{
		System.out.println("NonStatic block");
	}

	public static void main(String[] args) {

		System.out.println("main");
		NonStaticMemberDemo obj = new NonStaticMemberDemo();
		obj.doSomething();
	}
	
	static{
		System.out.println("Static block");
	}
	
	void doSomething() {
		System.out.println("method block");
	}

	

	
}
