
public class BarrelCard extends Card {
	
	//To be subclass in the card class for price of barrel cards.
	BarrelCard(String title, int value){
		super(title, value);
	}
	protected static Card[] cards = {new BarrelCard("$", 4), new BarrelCard("$", 4), new BarrelCard("$", 4), new BarrelCard("$", 4), new BarrelCard("$", 4), new BarrelCard("$", 4), new BarrelCard("$", 4), new BarrelCard("$", 4), new BarrelCard("$",10), new BarrelCard("$",10), new BarrelCard("$",10), new BarrelCard("$",10), new BarrelCard("$",10), new BarrelCard("$",20), new BarrelCard("$",20), new BarrelCard("$",20)};
	
	protected static void loadDeck(Deck deck){
		for(int i = 0; i<cards.length;i++){
			deck.add(cards[i]);
		}
	}
	//Barrel card types in a string array.
	private String[] barrelProperties = { "4 dollars", "10 dollars", "20 dollars"};
}
