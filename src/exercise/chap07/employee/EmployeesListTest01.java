package exercise.chap07.employee;

import java.util.Scanner;

public class EmployeesListTest01 {

	public static void main(String[] args) {

		EmployeesList list = EmployeesList.getInstance();
		Scanner in = new Scanner(System.in);

		list.enrolledEmployees();// ������

		// �������
		for (;;) {

			list.displayMenu();// �ý��� �޴����̱�

			int menu = in.nextInt(); // 1,2,3,4���߿� �ϳ�..

			switch (menu) {
			case 1: // �����ȸ
				list.showEmployees();
				break;
			case 2: // �űԻ�����
				System.out.println("���Ի�� �̸��� �Է��ϼ���>>>>");
				String empName = in.next();
				System.out.println("���Ի���� ��ȭ��ȣ�� �Է��ϼ���>>>>");
				String empPhone = in.next();
				list.addEmployees(new Employees(empName, empPhone));
				break;

			case 3: // �������
				System.out.println("������ �����ȣ�� �Է��ϼ���.>>>>");
				int empNumber = in.nextInt();
				if (!list.removeEmployees(empNumber)) { // list.removeEmployees(empNumber)==false
					System.out.println("������ �����ȣ�� �������� �ʽ��ϴ�.");
				}
				break;
			case 4:// ��������ý�������
				System.out.println("�ý����� ����Ǿ����ϴ�.");
				System.exit(-1);
			default:
			}
		}
		// �������

//		list.showEmployees();// �����ȸ
//		list.addEmployees(new Employees("�輱��", "010-1234-1234"));//���Ի�� ���
//		list.showEmployees();// �����ȸ
//		list.removeEmployees(20501);//�������

	}

}
