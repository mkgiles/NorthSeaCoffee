public class Tile {
	private Card card;
	private Player player;
	private Drill drill;
	Tile(){
	}
	public void purchase(Player player){
		this.player = player;
	}
	public void sell(){
		this.player = null;
		this.drill = null;
	}
	public String toString(){
		return "Card: " + card + "\nPlayer: " + player + "\nDrill: " + drill;
	}
	public Card getCard(){
		return card;
	}
	public Player getPlayer(){
		return player;
	}
	public Drill getDrill(){
		return drill;
	}
	//Contains information about owner and drill
	

	
	
	
}
