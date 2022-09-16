
public class PrimitiveAndString {

	public static void main(String[] args) {

		byte a = 10;
		String s= Byte.toString(a);
		byte y = Byte.parseByte(s);
		System.out.println(s);
		System.out.println(y);
	}

}
