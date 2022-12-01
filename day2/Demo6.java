package day2;

public class Demo6 {

	public static void main(String[] args) {
		// 今有雉、兔同籠，上有三十五頭，下九十四足。問雉、兔各幾何？
		/*
			35 * 2 = 70
			(94-70)/2 = 12 .. 兔
			35 - 12 = 23 .. 雞
		*/
		int total = 35;	// 題目: 上有三十五頭
		int feet  = 94; // 題目: 下九十四足

		int       x = total * 2;
		int rabbit  = (feet - x) / 2; // 兔
		int chicken = total - rabbit;  // 雞

		System.out.printf("雞: %d 兔: %d\n", rabbit, chicken);
	}

}