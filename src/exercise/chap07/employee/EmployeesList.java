package exercise.chap07.employee;

import java.util.ArrayList;

public class EmployeesList { 
	// 싱글톤패턴
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
		empList.add(new Employees("강동현", "010-9533-9533"));
		empList.add(new Employees("김재현", "010-9914-9914"));
		empList.add(new Employees("김준성", "010-5801-5801"));
		empList.add(new Employees("박건호", "010-9557-9557"));
		empList.add(new Employees("박성윤", "010-7193-7193"));
		empList.add(new Employees("강동현", "010-9533-9534"));
		empList.add(new Employees("강응찬", "010-2921-2921"));
		empList.add(new Employees("김석현", "010-2338-2338"));
		empList.add(new Employees("김우혁", "010-5318-5318"));
		empList.add(new Employees("김윤호", "010-3086-3086"));
	}
 
	public void showEmployees() {
		System.out.println("----------- 사원 정보 조회 -----------");
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
				System.out.println(employees + "을 삭제함");// 지우고자 하는 사원정보
				return true;
			}
		}
		return false;
	}
	
	public void displayMenu() {
		System.out.println("-------- ITCompany사원정보시스템----------");
		System.out.println("- 1. 사원정보조회 ");
		System.out.println("- 2. 신규사원등록");               
		System.out.println("- 3. 사원삭제 ");  
		System.out.println("- 4. 사원정보시스템종료");
		System.out.println("- --------------------------------------");
		
	}

}