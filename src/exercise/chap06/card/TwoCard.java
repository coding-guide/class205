package exercise.chap06.card;

public class TwoCard {
	public final String cardName = "Two Card";
	public int cardId;
	public String userName;
	
	public TwoCard(int serialNumber, String userName) {
		cardId = serialNumber;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "TwoCard [cardName=" + cardName + ", cardId=" + cardId + ", userName=" + userName + "]";
	}
	
	

}
