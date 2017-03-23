public class Tile {
	private Card card;
	private Player player;
	private Drill drill;
	Tile(){
	}
	public void purchase(Player player){
		this.player = player;
	}
	public void sell(Player player){
		if(player == this.player){
			this.player = null;
			this.drill = null;
		}
		else{
			IO.putLine("You don't own this concession!");
		}
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
	public void setDrill(Drill drill){
		this.drill = drill;
	}
	public void dropDrill(){
		this.drill = null;
	}
	public void addCard(WaterCard card){
		this.card = card;
	}
	public void dropCard(){
		this.card = null;
	}
	//Contains information about owner and drill
	

	
	
	
}
