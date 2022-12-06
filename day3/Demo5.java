package day3;

public class Demo5 {
	public static void main(String[] args) {
		
		// 條件運算子
		// &, &&(and), |, ||(or), !(not)
		int score = 30;
		
		if(score >= 60 && score <= 100) {
			System.out.println("及格");
		} else {
			System.out.println("不及格或分數錯誤");
		}

	}
}