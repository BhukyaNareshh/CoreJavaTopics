
public class ObjectAndString {

	public static void main(String[] args) {
		long a = 1000;
		Long b = Long.valueOf(a);
		String s = b.toString(a);
		System.out.println(s.length());
		Long x = Long.valueOf(s);
		System.out.println(x);

	}

}
