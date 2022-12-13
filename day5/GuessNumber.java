package day5;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int ans = 77;
		int min = 0;
		int max = 100;

		do {
			// user 猜
			Scanner scanner = new Scanner(System.in);
			System.out.printf("請 user 在 %d ~ %d 之間猜一數字: ", min, max);
			int userGuess = scanner.nextInt();
			// 判斷是否有猜中 ?
			if(userGuess < ans) {
				min = userGuess;
			} else if(userGuess > ans) {
				max = userGuess;
			} else {
				System.out.println("Bingo 恭喜 user 答對了");
				break;
			}


		} while(true);




	}

}