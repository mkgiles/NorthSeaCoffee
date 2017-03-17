public class Tile {
	Card card;
	Player player;
	Drill drill;
	Tile(){
	}
	public void purchase(Player player){
		this.player = player;
	}
	public String toString(){
		return "Card: " + card + "\nPlayer: " + player + "\nDrill: " + drill;
	}
	//Contains information about owner, drill, and blue card.
	
//	private String [] shallowWater = {"No Oil", "Small Deposits. 20'000 Barrels", "Medium Deposits, 40'000 Barrels"};
//	private String [] reefs = {"No Oil", "Small Deposits. 20'000 Barrels", "Medium Deposits, 40'000 Barrels", "Large Deposits, 100'000 Barrels"};
//	private String [] deepWater = {"No Oil", "Small Deposits. 20'000 Barrels", "Medium Deposits, 40'000 Barrels", "Large Deposits, 100'000 Barrels"};
//	
//	private String[][] tileProperties = { shallowWater, reefs, deepWater};
	
	
	
}
