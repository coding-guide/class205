package exercise.chap06;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person("������", 17, 10000);
		System.out.println(person);
		Bus bus = new Bus(38);
		System.out.println(bus);
		Subway subway = new Subway("�д缱");
		System.out.println(subway);
		System.out.println("------------------");
		
		person.takeBus(bus);
		person.takeBus(bus);
		person.takeSubway(subway);
		person.takeSubway(subway);
		System.out.println(person);
		System.out.println(bus);
		System.out.println(subway);
		System.out.println("------����2��, ��ö2��---------");
		person.takeBus(bus);
		person.takeBus(bus);
		person.takeBus(bus);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		System.out.println(person);
		System.out.println(bus);
		System.out.println(subway);
		System.out.println("----���� 3��, ��ö 3��");
		
		
	}

}
