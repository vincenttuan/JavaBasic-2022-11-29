package day4;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身份證字號: ");
		String id = sc.next();
		// id 共 10 碼(字元)
		if(id.length() != 10) {
			System.out.println("身份證字號長度不對");
			return;
		}
		// id     = "A203445566"
		// charAt =  0123456789  <- index
		char area = id.charAt(2);
		switch(area) {
			case '6':
				System.out.println("取得國籍之外國人"); 
				break;
			case '7':
				System.out.println("原無戶籍國民"); 
				break;
			case '8':
				System.out.println("原港澳居民"); 
				break;
			case '9':
				System.out.println("原大陸地區人民"); 
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
				System.out.println("其他"); 
				break;
			default: 
				System.out.println("錯誤"); 
		}

	}

}