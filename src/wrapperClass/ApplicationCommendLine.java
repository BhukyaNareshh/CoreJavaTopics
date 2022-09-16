package wrapperClass;

public class ApplicationCommendLine {

	public static void main(String[] args) {

		int length = args.length;
		if (length == 0) {
			System.out.println("no arguments provided");
		}else {
			System.out.println("arguments are provided");
			for(int i=0;i<length;i++) {
				System.out.println(args[i]);
				
			}
		}
	}

}
