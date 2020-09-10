package exercise.chap06;

public class Bus {
	public int busNumber;
	public int passengerCount;
	public int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void pickUpPerson(int money) {
		this.money = this.money + money;
		passengerCount++;
	}

	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", passengerCount=" + passengerCount + ", money=" + money + "]";
	}

	
}
