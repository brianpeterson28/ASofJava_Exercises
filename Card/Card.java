
public class Card {
/**
 * Creates a new Card object with the specified suit and rank. 
 * @param rank The rank represented as a String. 
 * @param suit The name of the desired suit as a String. 
 */
public Card(String rank, String suit){
	cardSuit = suit;
	cardRank = rank;
}

public String getSuit(){
	return cardSuit;
}

public String getRank(){
	return cardRank;
}

public String toString(){
	return cardRank + " of " + cardSuit;
}

private String cardSuit;
private String cardRank;


}
