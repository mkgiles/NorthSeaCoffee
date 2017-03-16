import java.util.HashMap;

public class Map {

	HashMap<String,Tile> tileMap;
	//Hashmap to be added for tile layout.
	Map(){
		 tileMap = new HashMap<String,Tile>();
		 for(int i = 0;i<4;i++){
			 for(int j=-1;j<=1;j++){
				 for(int k=-1;k<=1;k++){
					 if(!(j==k && j!=0)){
						 ;
					 }
				 }
			 }
		 }
	}
}
