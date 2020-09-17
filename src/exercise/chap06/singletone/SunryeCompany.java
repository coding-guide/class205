package exercise.chap06.singletone;

public class SunryeCompany {
	private static SunryeCompany instance = new SunryeCompany();
	
	private SunryeCompany() {
		// TODO Auto-generated constructor stub
	}
	
	public static SunryeCompany getInstance() {
		if(instance==null) {
			instance = new SunryeCompany();
		}
		return instance;
	}

}
