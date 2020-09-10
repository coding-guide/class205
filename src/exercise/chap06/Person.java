package exercise.chap06;

public class Person {
	public String personName;
	public int age;
	public int money;
	
	public Person(String personName, int age, int money) {
		this.personName = personName;
		this.age = age;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
//		������ȣ�� ���� ž��,������ Ÿ�� ����� �����մϴ�.
//		���ǿ����� ����� �����ؾߵ�
		if(this.age>=19) {
			if(this.money>=1300) {
				bus.pickUpPerson(1300);
				this.money = this.money - 1300; // money -= 1300;
			}else {
				System.out.println("����� �����մϴ�.");
			}//if ���
		}else {
			if(this.money>=1000) {
				bus.pickUpPerson(1000);
				this.money = this.money - 1000; // money -= 1000;
			}else {
				System.out.println("����� �����մϴ�.");
			}//if ���
		}//if ����
	}
	
	public void takeSubway(Subway subway) {
		if(this.age>=19) {
			if(this.money>=1250) {
				subway.pickUpPerson(1250);
				this.money = this.money - 1250; // money -= 1250;
			}else {
				System.out.println("����� �����մϴ�.");
			}//if ���
		}else {
			if(this.money>=720) {
				subway.pickUpPerson(720);
				this.money = this.money - 720; // money -= 720;
			}else {
				System.out.println("����� �����մϴ�.");
			}//if ���
		}//if ����
		
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", age=" + age + ", money=" + money + "]";
	}
	
	

}
