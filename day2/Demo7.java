package day2;

public class Demo7 {

	public static void main(String[] args) {
		
		int total = Integer.parseInt(args[0]); // args[0] 字串轉數字
		int feet  = Integer.parseInt(args[1]); // args[1] 字串轉數字

		int       x = total * 2;
		int rabbit  = (feet - x) / 2; // 兔
		int chicken = total - rabbit;  // 雞

		System.out.printf("雞: %d 兔: %d\n", chicken, rabbit);
	}

}