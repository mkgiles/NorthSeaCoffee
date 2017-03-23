abstract class Card {
	String title;
	//use enums to define card value, i.e. seasons, government in power, water depth. For barrel price this is simply the cost of a barrel
	Object value;
	//Superclass for Water, Political, Barrel Price, and Season cards.
	Card(String title, Object value){
		this.title = title;
		this.value = value;
	}
	
	protected static Card[] cards = null;
	
	protected static void loadDeck(Deck deck){
		for(int i = 0; i<cards.length;i++){
			deck.add(cards[i]);
		}
	}
	//used to control phase 3
	public static void activityPhase() {
		System.out.print("activityPhase");
		
	}
}