package exercise.chap06;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person("류세종", 17, 10000);
		System.out.println(person);
		Bus bus = new Bus(38);
		System.out.println(bus);
		Subway subway = new Subway("분당선");
		System.out.println(subway);
		
	}

}
