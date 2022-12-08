package day4;

import java.util.Scanner;

public class Demo7{
	/*  score    等級
	 * 90 ~ 100   A
	 * 80 ~ 89    B
	 * 70 ~ 79    C
	 * 60 ~ 69    D
	 * 0  ~ 59    E
	 * other -> "score error"
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入分數: ");
		int score = sc.nextInt();
		// 判斷資料範圍是否是在 0~100 之間 ?
		if(score >= 0 && score <= 100) {

			// 請利用 switch-case 來印出 score 的(A~E)等級
			int level = score / 10;
			switch(level) {
				case 10:
				case 9:
					System.out.println("A");
					break;
				case 8:
					System.out.println("B");
					break;
				case 7:
					System.out.println("C");
					break;
				case 6:
					System.out.println("D");
					break;
				default:
					System.out.println("E");
			}

		} else {
			System.out.println("分數錯誤");
		}



	}

}