package exercise.chap05;

import java.util.Calendar;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid=true;
	
	public MyDate() {
		Calendar cal = Calendar.getInstance();
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1;//0~11로 반환
		day = cal.get(Calendar.DATE);
		isValid = true;
	}//MyDate()
	
	public MyDate(int day, int month, int year) {
//		this.day = day;
//		this.month = month;
//		this.year = year;
		setYear(year);
		setMonth(month);
		setDay(day);
				
	}//MyDate(day,month,year)
	
	public int getDay() {
		return day;
	}//getDay()
	
	public void setDay(int day) {
		this.day = day;
		switch(this.month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day <1 || day >31) {
				isValid = false;
			}
			break;
		case 2:
			if(day <1 || day > 28) {
				isValid = false;
			}
			break;
		case 4: case 6: case 9: case 11:
			if(day <1 || day > 30) {
				isValid = false;
			}
			break;
		default:
			isValid = false;
			
		}
	}//setDay()
	
	public int getMonth() {
		return month;
	}//getMonth()
	
	public void setMonth(int month) {
		this.month = month;
		if(month < 1 || month >12) {
			isValid = false;
		}
		
	}//setMonth()
	
	public int getYear() {
		return year;
	}//getYear()
	
	public void setYear(int year) {
		if(year < 1900 || year > 9999) {
			isValid = false;
		}
		this.year = year;
		
	}//setYear()

	@Override
	public String toString() {
		if(isValid) {
			return "MyDate [" + year + "년 " + month + "월 " + day + "일]";
		}else {
			
			return "MyDate [" + year + "년 " + month + "월 " + day + "일] 유효하지 않은 날짜입니다.";
		}
	}
	
	
	

}
