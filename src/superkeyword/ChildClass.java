package superkeyword;

public class ChildClass extends SuperClass {

	public ChildClass() {
		this(10);
		System.out.println("no arg childclass constructure");
	}

	public ChildClass(int x) {
		super(x);
		System.out.println("one arg childclass constructure");
	}
	public static void main(String[] args) {
		ChildClass c = new ChildClass();

	}

}
