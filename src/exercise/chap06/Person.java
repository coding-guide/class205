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
//		버스번호를 보고 탑승,버스를 타면 요금을 지불합니다.
//		조건에따라서 요금을 지불해야됨
		if(this.age>=19) {
			if(this.money>=1300) {
				bus.pickUpPerson(1300);
				this.money = this.money - 1300; // money -= 1300;
			}else {
				System.out.println("요금이 부족합니다.");
			}//if 요금
		}else {
			if(this.money>=1000) {
				bus.pickUpPerson(1000);
				this.money = this.money - 1000; // money -= 1000;
			}else {
				System.out.println("요금이 부족합니다.");
			}//if 요금
		}//if 나이
	}
	
	public void takeSubway(Subway subway) {
		if(this.age>=19) {
			if(this.money>=1300) {
				subway.pickUpPerson(1300);
				this.money = this.money - 1300; // money -= 1300;
			}else {
				System.out.println("요금이 부족합니다.");
			}//if 요금
		}else {
			if(this.money>=1000) {
				subway.pickUpPerson(1000);
				this.money = this.money - 1000; // money -= 1000;
			}else {
				System.out.println("요금이 부족합니다.");
			}//if 요금
		}//if 나이
		
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", age=" + age + ", money=" + money + "]";
	}
	
	

}
