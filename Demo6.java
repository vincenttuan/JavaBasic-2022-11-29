package day3;

import java.util.Random;

public class Demo6 {

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(100); // 0~99 之間取一個整數亂數(隨機數)
		System.out.println(n);
		// 若 n >= 60 或 n 是偶數 則表示通過檢查 true
		if(n >= 60 || n % 2 == 0) {
			System.out.println("通過");
		} else {
			System.out.println("不通過");
		}
	}

}