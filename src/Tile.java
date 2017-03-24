public class Tile {
	private WaterCard card;
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
	public WaterCard getCard(){
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
	
	public double tilePrice()
	{
	if(getCard().title == "Shallow Water")
	{
		if(getCard().back == "No Oil")
		{
			drill.sell();
			double sellPrice = 0;
			return sellPrice;
		}
		if(getCard().back == "Small Deposits")
		{
			drill.sell();
			double sellPrice = 350000;
			return sellPrice;
		}
		if(getCard().back == "Medium Deposits")
		{
			drill.sell();
			double sellPrice = 750000;
			return sellPrice;
		}
	}
	if(getCard().title == "Reefs")
	{
		if(getCard().back == "No Oil")
		{
			drill.sell();
			double sellPrice = 0;
			return sellPrice;
		}
		if(getCard().back == "Small Deposits")
		{
			drill.sell();
			double sellPrice = 250000;
			return sellPrice;
		}
		if(getCard().back == "Medium Deposits")
		{
			drill.sell();
			double sellPrice = 650000;
			return sellPrice;
		}
		if(getCard().back == "Large Deposits")
		{
			drill.sell();
			double sellPrice = 1850000;
			return sellPrice;
		}
		if(getCard().title == "Deep Water")
		{
			if(getCard().back == "No Oil")
			{
				drill.sell();
				double sellPrice = 0;
				return sellPrice;
			}
			if(getCard().back == "Small Deposits")
			{
				drill.sell();
				double sellPrice = 150000;
				return sellPrice;
			}
			if(getCard().back == "Medium Deposits")
			{
				drill.sell();
				double sellPrice = 500000;
				return sellPrice;
			}
			if(getCard().back == "Large Deposits")
			{
				drill.sell();
				double sellPrice = 1700000;
				return sellPrice;
			}
	}
	}
	return 0;
	

	
	
	
}
	}
