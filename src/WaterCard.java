
public class WaterCard extends Card{
	public String back;
	//To be subclass in the card class for type of tile cards.
	WaterCard(String title, String back, int value){
		super(title, value);
		this.back = back;
	}
	protected static Card[] cards = {new WaterCard("Shallow Water", "No Oil", 0),new WaterCard("Shallow Water", "Small Deposits", 20000),new WaterCard("Shallow Water", "Medium Deposits", 40000),new WaterCard("Reefs", "No Oil", 0),new WaterCard("Reefs", "Small Deposits", 20000),new WaterCard("Reefs", "Medium Deposits", 40000),new WaterCard("Reefs", "Large Deposits", 100000),new WaterCard("Deep Water", "Small Deposits", 20000),new WaterCard("Deep Water", "Medium Deposits", 40000),new WaterCard("Deep Water", "Large Deposits", 100000)};
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
	public String toString(){
		return title + '|' + back;
	}
}


