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
			IO.print(tile.getCard().title + "|" + tile.getCard().back);
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
	public void weather(SeasonCard weatherCard, BarrelCard barrelCard){
		for(String i: tileMap.keySet()){
			Tile tile = tileMap.get(i);
			if(tile.getPlayer() != null){
				if(tile.getDrill() != null){
					Player player = tile.getPlayer();
					Drill drill = tile.getDrill();
					String quadrant = "" + i.charAt(0) + i.charAt(1);
					int weather;
					if(quadrant == "NW"){
						weather = weatherCard.weatherAt(0); 
					}
					else if(quadrant == "SW"){
						weather = weatherCard.weatherAt(1);
					}
					else if(quadrant == "NE"){
						weather = weatherCard.weatherAt(2);
					}
					else if(quadrant == "SE"){
						weather = weatherCard.weatherAt(3);
					}
					else{
						weather = -1;
					}
					int yield;
					yield = (int) tile.getCard().value * (int) barrelCard.value;
					if(weather == 0){
						yield *= 1; 
					}
					else if(weather == 1){
						yield /= 2;
					}
					else if(weather == 3){
						yield = 0;
					}
					else if(weather == 4){
						yield = 0;
						drill.displace();
						drill.sell();
						tile.dropDrill();
						player.sellDrill(drill);
					}
					player.addCash(yield);
				}
			}
		}
	}
	public String toString(){
		return tileMap.toString();
	}
}
