import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;

public class Deck {
	//Class for the storage of cards in a deck.
	private ArrayDeque<Card> deck;
	private Rand rand;
	public static final Random gen = new Random();
	Deck(){
		deck = new ArrayDeque<Card>();
		rand = new Rand();
	}
	public Card read(){
		return deck.pop();
	}
	public void replace(Card card){
		deck.push(card);
	}
	public void shuffle() {
		Object[] array = deck.toArray();
	    int n = array.length;
	    while (n > 1) {
	        int k = gen.nextInt(n--); //decrements after using the value
	        Object temp = array[n];
	        array[n] = array[k];
	        array[k] = temp;
	    }
	}
}
