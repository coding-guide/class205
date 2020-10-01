package exercise.chap07.employee;

import java.util.ArrayList;

public class EmployeesList { 
	// �̱�������
	private static EmployeesList instance = new EmployeesList();

	ArrayList<Employees> empList = new ArrayList<Employees>();

	private EmployeesList() {
		// TODO Auto-generated constructor stub
	}

	public static EmployeesList getInstance() {

		if (instance == null) {
			instance = new EmployeesList();
		}
		return instance;

	}

	public void enrolledEmployees() {
		empList.add(new Employees("������", "010-9533-9533"));
		empList.add(new Employees("������", "010-9914-9914"));
		empList.add(new Employees("���ؼ�", "010-5801-5801"));
		empList.add(new Employees("�ڰ�ȣ", "010-9557-9557"));
		empList.add(new Employees("�ڼ���", "010-7193-7193"));
		empList.add(new Employees("������", "010-9533-9534"));
		empList.add(new Employees("������", "010-2921-2921"));
		empList.add(new Employees("�輮��", "010-2338-2338"));
		empList.add(new Employees("�����", "010-5318-5318"));
		empList.add(new Employees("����ȣ", "010-3086-3086"));
	}
 
	public void showEmployees() {
		System.out.println("----------- ��� ���� ��ȸ -----------");
		for (Employees employees : empList) {
			System.out.println(employees);
		}
	}

	public void addEmployees(Employees emp) {
		empList.add(emp);
	}

	public boolean removeEmployees(int number) {
		for (Employees employees : empList) {
			if (number == employees.getEmployeeID()) {
				empList.remove(employees);
				System.out.println(employees + "�� ������");// ������� �ϴ� �������
				return true;
			}
		}
		return false;
	}
	
	public void displayMenu() {
		System.out.println("-------- ITCompany��������ý���----------");
		System.out.println("- 1. ���������ȸ ");
		System.out.println("- 2. �űԻ�����");               
		System.out.println("- 3. ������� ");  
		System.out.println("- 4. ��������ý�������");
		System.out.println("- --------------------------------------");
		
	}

}