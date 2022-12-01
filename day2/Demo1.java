package day2;

public class Demo1 {

	public static void main(String[] args) {
		byte  a = 10;
		short b = 28000;
		int   c = 100_0000;
		long  d = 200_0000_0000L;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.printf("%,d\n", a); // f -> format
		System.out.printf("%,d\n", b);
		System.out.printf("%,d\n", c);
		System.out.printf("%,d\n", d);
	}

}