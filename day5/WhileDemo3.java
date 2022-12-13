package day5;

public class WhileDemo3 {

	public static void main(String[] args) {
		int x = 1;
		int y = 10;
		while(x++ < y--) {
			System.out.printf("x=%d, y=%d\n", x, y);
			System.out.println("Java");
			//x++;
			//y--;
		}

	}

}