package day2;
import java.math.BigDecimal;
public class Demo5 {

	public static void main(String[] args) {
		int score = 75;
		boolean pass = score >= 60;
		System.out.println(score);
		System.out.println(pass);

		System.out.println((1+1) == 2);
		System.out.println((1+1+1) == 3);
		System.out.println((0.1+0.1) == 0.2);
		System.out.println((0.1+0.1+0.1) == 0.3);
		System.out.println(0.1+0.1+0.1);

		BigDecimal a = new BigDecimal("0.1");
		BigDecimal b = new BigDecimal("0.1");
		BigDecimal c = new BigDecimal("0.1");
		BigDecimal result = a.add(b).add(c);
		System.out.println(result);


	}

}