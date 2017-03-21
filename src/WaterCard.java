
public class WaterCard extends Card{
	
	//To be subclass in the card class for type of tile cards.
	WaterCard(String title, int value){
		super(title, value);
	}
	
	//String arrays for the water tiles.
	private String[][] tileProperties = { shallowWater, reefs, deepWater};
	private static String [] shallowWater = {"No Oil", "Small Deposits. 20'000 Barrels", "Medium Deposits, 40'000 Barrels"};
	private static String [] reefs = {"No Oil", "Small Deposits. 20'000 Barrels", "Medium Deposits, 40'000 Barrels", "Large Deposits, 100'000 Barrels"};
	private static String [] deepWater = {"No Oil", "Small Deposits. 20'000 Barrels", "Medium Deposits, 40'000 Barrels", "Large Deposits, 100'000 Barrels"};

}


