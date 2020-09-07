package exercise.chap05;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();//디폴트생성자
		System.out.println(date);
		MyDate date2 = new MyDate(25, 8, 2020);
		System.out.println(date2);
	}

}
