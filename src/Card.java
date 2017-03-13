
class Card {
	String title;
	//use enums to define card value, i.e. seasons, government in power, water depth. For barrel price this is simply the cost of a barrel
	int value;
	//Superclass for Water, Political, Barrel Price, and Season cards.
	public Card(String title, int value){
		this.title = title;
		this.value = value;
	}
	
	//used to control phase 3
	public static void activityPhase() {
		System.out.print("activityPhase");
		
	}
}