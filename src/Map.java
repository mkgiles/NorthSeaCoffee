import java.util.HashMap;

public class Map {

	HashMap<String,Tile> tileMap;
	private enum Quadrant{
		NE, SE, SW, NW
	}
	//Hashmap to be added for tile layout.
	Map(){
		 tileMap = new HashMap<String,Tile>();
		 for(Quadrant i: Quadrant.values()){
			 for(int j=-1;j<=1;j++){
				 for(int k=-1;k<=1;k++){
					 if(!(j==k && j!=0)){
						 String key = "" + i + j + k;
						 tileMap.put(key, new Tile());
					 }
				 }
			 }
		 }
	}
	public void peek(Player player, String coordinate, Deck deck){
		if(tileMap.containsKey(coordinate)){
			Tile tile = tileMap.get(coordinate);
			player.removeCash(100000);
			tile.addCard((WaterCard)deck.read());
		}
	}
	public void purchase(Player player, String coordinate, Deck deck){
		if(tileMap.containsKey(coordinate)){
			Tile tile = tileMap.get(coordinate);
			if(tile.getPlayer()==null && player.getConcessionsRemaining() > 0){
				Bank.bidWar(tile, deck);
			}
			else{
				IO.putLine("Cannot process.");
			}
		}
		else{
			IO.putLine("Invalid Coordinate.");
		}
	}
	
	public void sell(Player player, String coordinate){
		if(tileMap.containsKey(coordinate)){
			Tile tile = tileMap.get(coordinate);
			player.dropConcession(tile);
			tile.sell(player);
			player.addCash(tile.tilePrice());
		}
		else{
			IO.putLine("NO SALE");
		}
	}
	public String toString(){
		return tileMap.toString();
	}
}
