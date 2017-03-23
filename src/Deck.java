import java.util.ArrayList;

public class Deck {
	//Class for the storage of cards in a deck.
	private ArrayList<Card> deck;
	private static Rand rand;
	private static int[] seed;
	//use ISAAC for random number generation.
	public static void deckInit(){
		rand = new Rand();
		seed = new int[256];
		for(int i=0;i<256;i++){
			seed[i]=(int) (Math.random()*(0xFFFFFFFF)); //seed ISAAC with clock values.
		}
		rand.Init(true);
	}
	Deck(){
		deck = new ArrayList<Card>();
	}
	public Card read(){
		Card card = deck.remove(0);
		IO.print(card);
		return card;
	}
	public void add(Card card){
		deck.add(card);
	}
	//Knuth Shuffle.
	public void shuffle() {
	    int n = deck.size();
	    while (n > 0) {
	        int k = Math.abs(rand.val()%n--); //decrements after using the value
	        Card temp = deck.get(n);
	        deck.remove(n);
	        deck.add(n,deck.get(k));
	        deck.remove(k);
	        deck.add(k,temp);
	    }
	}
	public String toString(){
		String ret = "";
		ret = ret + "Cards:\n";
		for(int i=0;i<deck.size();i++){
			ret = ret + i + ": " + deck.get(i) + "\n";
		}
		return ret;
	}
}
