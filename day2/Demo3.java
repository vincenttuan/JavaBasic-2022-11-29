package day2;

public class Demo3 {

	public static void main(String[] args) {
		
		float  f  = 3.14F;
		double pi = 3.14;

		System.out.println(f);
		System.out.println(pi);

		double price = 10000.283;
		System.out.println(price); // 10000.283
		System.out.printf("%,.2f\n", price); // 10,000.28
		System.out.printf("%,.1f\n", price); // 10,000.3
	}

}