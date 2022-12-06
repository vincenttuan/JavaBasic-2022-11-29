package day3;

public class Demo1 {

	public static void main(String[] args) {
		
		// 數學相關的算術運算子
		// +, -, *, /, %, ++, --
		System.out.printf("5+2=%d\n", (5+2));
		System.out.printf("5-2=%d\n", (5-2));
		System.out.printf("5*2=%d\n", (5*2));
		System.out.printf("5/2=%d\n", (5/2));
		System.out.printf("5%%2=%d\n", (5%2));

		int x = 10;
		// ++ 加 1, -- 減 1
		//System.out.println(++x); // 等於x先+1後再印出 x 的內容
		System.out.println(x++); // 等於先印出 x 的內容在將 x+1
		System.out.println(x);
	}

}