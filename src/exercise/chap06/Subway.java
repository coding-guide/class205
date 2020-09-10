package exercise.chap06;

public class Subway {
	public String lineNumber;
	public int passenerCount;
	public int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void pickUpPerson(int money) {
		this.money = this.money+money;
		passenerCount++;
	}

	@Override
	public String toString() {
		return "Subway [lineNumber=" + lineNumber + ", passenerCount=" + passenerCount + ", money=" + money + "]";
	}
	
	

}
