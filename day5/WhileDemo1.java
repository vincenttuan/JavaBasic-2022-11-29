package day5;

import java.util.Random;

public class WhileDemo1 {

	public static void main(String[] args) {
		Random random = new Random();

		while(true) {
			int n = random.nextInt(100); // 0~99
			if(n % 2 == 1) {
				continue;
			}
			System.out.println(n);
			if(n == 50) {
				break;
			}
		}

	}

}