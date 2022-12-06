package day3;

public class Demo4 {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;

		//System.out.println(a == b++);
		//System.out.println(a == ++b);
		System.out.println(a++ > b--);
		System.out.printf("a = %d\n", a);
		System.out.printf("b = %d\n", b);

	}

}