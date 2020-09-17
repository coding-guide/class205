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
		// ī�� ������ȣ�� �Ҵ��ؼ� OneCard�� �����Ѵ�.
		//OneCard(int serialNumber, String userName)
		OneCard card = new OneCard(serialNumber++, userName);
		return card;
		
	}
	
	public TwoCard createTwoCard(String userName) {
		// ī�� ������ȣ�� �Ҵ��ؼ� TwoCard�� �����Ѵ�.
		TwoCard card = new TwoCard(serialNumber++, userName);
		return card;
	}
}//class
