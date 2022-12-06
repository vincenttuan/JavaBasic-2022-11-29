package day3;

public class Demo7 {

	public static void main(String[] args) {
		// & 與 &&
		int x = 45;
		if(x >= 60 & ++x > 90) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		System.out.printf("x = %d\n", x);

	}

}