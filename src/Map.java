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
	public String toString(){
		return tileMap.toString();
	}
}
