package exercise.chap06.card;

public class CardCompanyTest {

	public static void main(String[] args) {
		CardCompany ins = CardCompany.getInstance();
		OneCard card1 = ins.createOneCard("������");
		OneCard card2 = ins.createOneCard("�ŵ���");
		TwoCard card3 = ins.createTwoCard("������");
		TwoCard card4 = ins.createTwoCard("�����");
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		System.out.println(card4);
		
		// ���� : �����̸����ε� ī�带 �ϳ� ��ȹ�߽��ϴ�. 
		// OneCard,TwoCard�� ���� ī���̸�, ī���ȣ, ī��������� ��������� �ֽ��ϴ�.
		// ���� ī�带 �����Ҷ��� ī��������� �̸����� �����ϸ� ī�� ������ȣ�� CardCompany�κ��� �޾Ƽ�
		// �����մϴ�.
		// �����̸����� �� ī�� Ŭ������ ����� �׽�Ʈ �ڵ忡�� ����,����غ��ϴ�.
	}

}
