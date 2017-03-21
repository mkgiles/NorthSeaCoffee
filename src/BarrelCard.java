
public class BarrelCard extends Card {
	
	//To be subclass in the card class for price of barrel cards.
	BarrelCard(String title, int value){
		super(title, value);
	}
	
	//Barrel card types in a string array.
	private String[] barrelProperties = { "4 dollars", "10 dollars", "20 dollars"};
}
