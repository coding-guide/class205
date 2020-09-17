package exercise.chap06.singletone;

public class SunryeCompanyTest {

	public static void main(String[] args) {
		SunryeCompany instance = SunryeCompany.getInstance();
		System.out.println(instance);
		SunryeCompany instance2 = SunryeCompany.getInstance();
		System.out.println(instance2);
	}

}
