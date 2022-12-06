package day3;

public class Demo9 {

	public static void main(String[] args) {
		int parking = 0b10010;
		System.out.println(parking);
		System.out.printf("停車前: %s\n", Integer.toBinaryString(parking));
		int no = 2;
		System.out.printf("停 %d 號車位\n", no);
		int car = (int)(Math.pow(2, no));
		System.out.printf("car = %d\n", car);
		if((parking & car) == 0) {
			System.out.printf("%d 號車位可以停車\n", no);
			// 將車子停入
			parking += car; // parking = parking + car;
		} else {
			System.out.printf("%d 號車位不可以停車\n", no);
		}
		System.out.printf("停車後: %s\n", Integer.toBinaryString(parking));
		System.out.println(parking);
	}

}