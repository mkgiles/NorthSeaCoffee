
public class Drill {
	//3 types of drills, will be added to player inventory upon purchase, added to
	//tile when placed and removed from tile when destroyed by weather.
	private enum drillType {
		SHALLOW, DEEP, REEF
	}
	private drillType type;
	private Player owner;
	private Tile tile;
	Drill(int type){
		this.type = drillType.values()[type];
	}
	public void purchase(Player owner){
		this.owner = owner;
	}
	public void place(Tile tile){
		this.tile = tile;
	}
	//Used to control phase 2
	public static void drillPhase() {
		System.out.print("drillPhase");
		
	}
	
}
