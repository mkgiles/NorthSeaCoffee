import java.util.ArrayList;

public class Deck {
	//Class for the storage of cards in a deck.
	private ArrayList<Card> deck;
	//use ISAAC for random number generation.
	private Rand rand;
	Deck(){
		deck = new ArrayList<Card>(52);
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
	    int n = deck.size();
	    while (n > 1) {
	        int k = rand.val()%52; //decrements after using the value
	        Card temp = deck.get(n);
	        deck.add(n,deck.get(k));
	        deck.add(k,temp);
	    }
	}
}
