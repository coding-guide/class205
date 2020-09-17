package exercise.chap06.card;

public class OneCard {
	public final String cardName = "One Card";
	public int cardId;
	public String userName;
	
	public OneCard(int serialNumber, String userName) {
		cardId = serialNumber;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "OneCard [cardName=" + cardName + ", cardId=" + cardId + ", userName=" + userName + "]";
	}
}
