package day4;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入分數: ");
		int score = sc.nextInt(); // 得到使用者所輸入的數字
		
		if(score >= 60) 
			System.out.println("及格");
		else
			System.out.println("不及格");

		if(score >= 60) {
			System.out.println("及格");
		}
		else {
			System.out.println("不及格");
		}

		// if - else 也可以改用 ? : (三元運算子)
		System.out.println( (score >= 60) ? "及格" : "不及格" );

	}

}