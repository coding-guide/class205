package exercise.chap07.employee;

public class Employees { 
 
	private static int serialNumber = 20501;
	public int employeeID;
	public String employeeName;
	public String employeePhoneNumber;

	public Employees(String employeeName, String employeePhoneNumber) {
		this.employeeID = serialNumber++;
		this.employeeName = employeeName;
		this.employeePhoneNumber = employeePhoneNumber;
	}

	@Override
	public String toString() {
		return "[사원번호:" + employeeID + " 사원이름:" + employeeName + "  전화번호:" + employeePhoneNumber + "]";
	}

	public int getEmployeeID() {
		return employeeID;
	}

}
