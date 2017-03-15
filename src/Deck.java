import java.util.ArrayList;

public class Deck {
	//Class for the storage of cards in a deck.
	private ArrayList<Card> deck;
	//use ISAAC for random number generation.
	private Rand rand;
	Deck(){
		deck = new ArrayList<Card>();
		rand = new Rand();
	}
	public Card read(){
		return deck.remove(0);
	}
	public void replace(Card card){
		deck.add(card);
	}
	//Knuth Shuffle courtesy of Rosetta Code.
	public void shuffle() {
	    int n = deck.size()-1;
	    while (n > 0) {
	        int k = rand.val()%n--; //decrements after using the value
	        Card temp = deck.get(n);
	        deck.add(n,deck.get(k));
	        deck.add(k,temp);
	    }
	}
}
