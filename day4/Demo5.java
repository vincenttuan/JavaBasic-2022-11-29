package day4;

import java.util.Scanner;

public class Demo5 {
	/*
	 * 使用者輸入身高與體重
	 * 系統可以印出 "bmi 值" 與 "bmi 值的說明"
	 * bmi 值的說明:
	 * bmi < 18       -> 印出 "過輕"
	 * 18 <= bmi < 23 -> 印出 "正常"
	 * bmi >= 23      -> 印出 "過重"
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身高與體重(中間用空格隔開): ");
		double h = sc.nextDouble();
		double w = sc.nextDouble();
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("BMI: %.1f\n", bmi);
		if(bmi < 18) {
			System.out.println("過輕");
		} else if(bmi >= 23) {
			System.out.println("過重");
		} else {
			System.out.println("正常");
		}

	}
}