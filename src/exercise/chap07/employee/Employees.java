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
		return "[�����ȣ:" + employeeID + " ����̸�:" + employeeName + "  ��ȭ��ȣ:" + employeePhoneNumber + "]";
	}

	public int getEmployeeID() {
		return employeeID;
	}

}
