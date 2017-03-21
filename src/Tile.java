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
	//Contains information about owner and drill
	

	
	
	
}
