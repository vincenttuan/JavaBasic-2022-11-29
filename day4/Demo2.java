package day4;

public class Demo2 {

	public static void main(String[] args) {
		
		int money = 100;

		if(money == 0) { // 不可以寫成 money = 0
			System.out.println("No money");
		} else {
			System.out.printf("money: %d\n", money);
		}

	}

}