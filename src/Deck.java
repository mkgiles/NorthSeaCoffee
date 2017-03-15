import java.util.ArrayDeque;
import java.util.List;
public class Deck {
	//Class for the storage of cards in a deck.
	private ArrayDeque<Card> deck;
	Deck(){
		deck = new ArrayDeque<Card>();
	}
	public Card read(){
		return deck.pop();
	}
	public void replace(Card card){
		deck.push(card);
	}
	public void shuffle(){
		java.util.Collections.shuffle((List<?>) deck);
	}
}
