package day5;

public class WhileNineTable {

	public static void main(String[] args) {
		int n = 13;

		int x = 1;
		while(x <= n) {

			int y = 1;
			while(y <= n) {
				//System.out.printf("%2d x %2d = %-3d  ", x, y, (x*y));	
				System.out.printf("%2d x %-2d = %3d  ", x, y, (x*y));	
				y++;
			}
			System.out.println();

			x++;
		}


	}

}