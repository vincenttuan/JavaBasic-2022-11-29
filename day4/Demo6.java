package day4;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("請輸入 weekDay (1~7): ");
		int weekDay = sc.nextInt();
		if(weekDay == 1) {
			System.out.println("星期日");
		} else if(weekDay == 2) {
			System.out.println("星期一");
		} else if(weekDay == 3) {
			System.out.println("星期二");
		} else if(weekDay == 4) {
			System.out.println("星期三");
		} else if(weekDay == 5) {
			System.out.println("星期四");
		} else if(weekDay == 6) {
			System.out.println("星期五");
		} else if(weekDay == 7) {
			System.out.println("星期六");
		} else {
			System.out.println("weekDay 錯誤");
		}

		
	}

}