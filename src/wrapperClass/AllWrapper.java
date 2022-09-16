package wrapperClass;

public class AllWrapper {

	public static void main(String[] args) {

		int a = 100;
		
		String s = Integer.toString(a);
		
		Integer i = new Integer(s);
		System.out.println(s);
		
		int b = i.intValue();
		
		Integer c = new Integer(b);
		
		String v = c.toString();
		
		int e = Integer.parseInt(v);

	}

}
