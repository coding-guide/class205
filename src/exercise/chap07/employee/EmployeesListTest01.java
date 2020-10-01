package exercise.chap07.employee;

import java.util.Scanner;

public class EmployeesListTest01 {

	public static void main(String[] args) {

		EmployeesList list = EmployeesList.getInstance();
		Scanner in = new Scanner(System.in);

		list.enrolledEmployees();// 사원등록

		// 여기부터
		for (;;) {

			list.displayMenu();// 시스템 메뉴보이기

			int menu = in.nextInt(); // 1,2,3,4번중에 하나..

			switch (menu) {
			case 1: // 사원조회
				list.showEmployees();
				break;
			case 2: // 신규사원등록
				System.out.println("신입사원 이름을 입력하세요>>>>");
				String empName = in.next();
				System.out.println("신입사원의 전화번호를 입력하세요>>>>");
				String empPhone = in.next();
				list.addEmployees(new Employees(empName, empPhone));
				break;

			case 3: // 사원삭제
				System.out.println("삭제할 사원번호를 입력하세요.>>>>");
				int empNumber = in.nextInt();
				if (!list.removeEmployees(empNumber)) { // list.removeEmployees(empNumber)==false
					System.out.println("삭제할 사원번호가 존재하지 않습니다.");
				}
				break;
			case 4:// 사원정보시스템종료
				System.out.println("시스템이 종료되었습니다.");
				System.exit(-1);
			default:
			}
		}
		// 여기까지

//		list.showEmployees();// 사원조회
//		list.addEmployees(new Employees("김선례", "010-1234-1234"));//신입사원 등록
//		list.showEmployees();// 사원조회
//		list.removeEmployees(20501);//사원삭제

	}

}
