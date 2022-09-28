package interfaces;

public class Honda implements car {

	@Override
	public void go() {
		System.out.println("inside go method");
	}

	@Override
	public void speed() {
		System.out.println("inside speed method");
	}

}
