package day3;

public class Demo10 {

	public static void main(String[] args) {
		int parking = 0b10110;
		System.out.println(parking);
		System.out.printf("移車前: %s\n", Integer.toBinaryString(parking));
		int no = 2;
		System.out.printf("移動 %d 號車位\n", no);
		int car = (int)(Math.pow(2, no));
		System.out.printf("car = %d\n", car);
		if((parking & car) != 0) {
			System.out.printf("%d 號車位可以移車\n", no);
			// 將車子移出
			parking -= car; // parking = parking - car;
		} else {
			System.out.printf("%d 號車位無車可移\n", no);
		}
		System.out.printf("移車後: %s\n", Integer.toBinaryString(parking));
		System.out.println(parking);
	}

}