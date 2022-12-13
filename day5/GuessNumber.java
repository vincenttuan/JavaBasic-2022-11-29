package day5;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int ans = random.nextInt(99) + 1; // 1~99
		int min = 0;
		int max = 100;

		do {
			// user 猜
			Scanner scanner = new Scanner(System.in);
			System.out.printf("請 user 在 %d ~ %d 之間猜一數字: ", min, max);
			int userGuess = scanner.nextInt();
			// 判斷所猜的數字是否在提示範圍內 ?
			if(userGuess <= min || userGuess >= max) {
				System.out.println("範圍錯誤請重猜~");
				continue;
			}
			// 判斷 user 是否有猜中 ?
			if(userGuess < ans) {
				min = userGuess;
			} else if(userGuess > ans) {
				max = userGuess;
			} else {
				System.out.println("Bingo 恭喜 user 答對了");
				break;
			}
			// pc 猜
			int pcGuess = random.nextInt(max-min-1) + min + 1;
			System.out.printf("請 pc 在 %d ~ %d 之間猜一數字: %d\n", min, max, pcGuess);
			// 判斷 pc 是否有猜中 ?
			if(pcGuess < ans) {
				min = pcGuess;
			} else if(pcGuess > ans) {
				max = pcGuess;
			} else {
				System.out.println("Bingo 恭喜 pc 答對了");
				break;
			}

		} while(true);




	}

}