package superkeyword;

public class Child extends Parent {
	int c, d;

	Child(int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;
	}

	void display() {
		System.out.println("parents a=" + super.a);
		System.out.println("parents a=" + super.b);
		System.out.println("parents a=" + this.c);
		System.out.println("parents a=" + this.d);
	}

	public void m1() {
		super.m1();
		System.out.println("inside child");
	}

}
