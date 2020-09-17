package exercise.chap06.card;

public class CardCompany {
	private static int serialNumber=20501;
	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {
		// TODO Auto-generated constructor stub
	}
	
	public static CardCompany getInstance() {
		if(instance==null) {
			instance=new CardCompany();
		}
		return instance;
	}
	
	public OneCard createOneCard(String userName) {
		// 카드 고유번호를 할당해서 OneCard를 생성한다.
		//OneCard(int serialNumber, String userName)
		OneCard card = new OneCard(serialNumber++, userName);
		return card;
		
	}
	
	public TwoCard createTwoCard(String userName) {
		// 카드 고유번호를 할당해서 TwoCard를 생성한다.
		TwoCard card = new TwoCard(serialNumber++, userName);
		return card;
	}
}//class
