package day3;

public class Demo3 {

	public static void main(String[] args) {
		// 決策相關的關係, 運算之後的結果一定是 boolean 值(true or false)
		// >, >=, <, <=, ==
		int a = 1;
		int b = 2;
		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(a < b);
		boolean check = (a <= b); // 將運算的結果放入到check變數裡面儲存
		System.out.println(check);

	}
}