
public class WaterCard extends Card{
	String back;
	//To be subclass in the card class for type of tile cards.
	WaterCard(String title, String back, Object value){
		super(title, value);
		this.back = back;
	}
	protected static Card[] cards = {new WaterCard("Shallow Water", "No Oil", null)};
	protected static void loadDeck(Deck deck){
		 for(int i = 0; i<cards.length;i++){
				deck.add(cards[i]);
			}
	 }
	//String arrays for the water tiles.
	private static String [] tileProperties = { "shallowWater", "reefs", "deepWater"};
	private static String [] shallowWater = {"No Oil", "Small Deposits. 20'000 Barrels", "Medium Deposits, 40'000 Barrels"};
	private static String [] reefs = {"No Oil", "Small Deposits. 20'000 Barrels", "Medium Deposits, 40'000 Barrels", "Large Deposits, 100'000 Barrels"};
	private static String [] deepWater = {"No Oil", "Small Deposits. 20'000 Barrels", "Medium Deposits, 40'000 Barrels", "Large Deposits, 100'000 Barrels"};

}


