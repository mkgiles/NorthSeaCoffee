import java.util.ArrayList;

public class Deck {
	//Class for the storage of cards in a deck.
	private ArrayList<Card> deck;
	//use ISAAC for random number generation.
	private Rand rand;
	Deck(){
		deck = new ArrayList<Card>();
		int[] seed = new int[256];
		for(int i=0;i<256;i++){
			seed[i]=(int) (Math.random()*(0xFFFFFFFF)); //seed ISAAC with clock values.
		}
		rand = new Rand(seed);
		rand.Init(true);
	}
	Deck(boolean testing){
		deck = new ArrayList<Card>();
		int[] seed = new int[256];
		for(int i=0;i<256;i++){
			seed[i]=(int) (Math.random()*(0xFFFFFFFF)); //seed ISAAC with clock values.
		}
		rand = new Rand(seed);
		rand.Init(true);
		for(int i = 0; i < 100; i++){
			deck.add(new Card("Card: " + i, i));
		}
	}
	public void read(){
		System.out.println(deck.get(0));
	}
	public void replace(Card card){
		deck.add(card);
	}
	//Knuth Shuffle.
	public void shuffle() {
	    int n = deck.size();
	    System.out.println(n);
	    while (n > 0) {
	        int k = Math.abs(rand.val()%n--); //decrements after using the value
	        System.out.println(k);
	        Card temp = deck.get(n);
	        System.out.println(temp);
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
