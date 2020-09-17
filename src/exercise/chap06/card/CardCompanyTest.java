package exercise.chap06.card;

public class CardCompanyTest {

	public static void main(String[] args) {
		CardCompany ins = CardCompany.getInstance();
		OneCard card1 = ins.createOneCard("강응찬");
		OneCard card2 = ins.createOneCard("신동민");
		TwoCard card3 = ins.createTwoCard("강동현");
		TwoCard card4 = ins.createTwoCard("이재원");
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		System.out.println(card4);
		
		// 과제 : 본인이름으로된 카드를 하나 기획했습니다. 
		// OneCard,TwoCard와 같이 카드이름, 카드번호, 카드소유자의 멤버변수가 있습니다.
		// 또한 카드를 생성할때는 카드소유자의 이름으로 생성하며 카드 고유번호를 CardCompany로부터 받아서
		// 생성합니다.
		// 본인이름으로 된 카드 클래스를 만들고 테스트 코드에서 생성,출력해봅니다.
	}

}
