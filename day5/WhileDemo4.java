package day5;

public class WhileDemo4 {
	/*
		@
		@@
		@@@
		@@@@
		@@@@@
	*/
	public static void main(String[] args) {
		int count = 5;
		int x = 1;
		while(x <= count) {
			int y = 1;
			//System.out.printf("x=%d y=%d\n", x, y);
			while(y <= x) {
				System.out.print("@");
				y++;
			}

			System.out.println();
			x++;
		}

	}

}