
public class Drill {
	//3 types of drills, will be added to player inventory upon purchase, added to
	//tile when placed and removed from tile when destroyed by weather.
	private enum drillType {
		SHALLOW, DEEP, REEF
	}
	private double [] drillGetCosts = {100000,250000,500000};
	private double [] drillSellCosts = {50000,150000,300000};
	public static Drill[] drillList = new Drill[] { new Drill(0), new Drill(0),new Drill(0), new Drill(0),new Drill(1),new Drill(1), new Drill(1),new Drill(1), new Drill(1),new Drill(2),new Drill(2),new Drill(2)};
	private drillType type;
	private Player owner;
	private Tile tile;
	Drill(int type){
		this.type = drillType.values()[type];
	}
	public void purchase(Player owner){
		this.owner = owner;
		owner.removeCash(drillGetCosts[this.getType()]);
	}
	public void sell(){
		this.owner = null;
		owner.addCash(drillSellCosts[this.getType()]);
	}
	public void place(Tile tile){
		this.tile = tile;
	}
	public void displace(){
		this.tile = null;
		
	}
	
	public void transfer(Tile tile)
	{
		displace();
		place(tile);
		owner.removeCash(20000);
	}
	
	public int getType(){
		return this.type.ordinal();
	}
	public Player getOwner(){
		return this.owner;
	}
	public Tile getTile(){
		return this.tile;
	}
	//Used to control phase 2
	public static void drillPhase() {
		System.out.print("drillPhase");
		
	}
	
}
