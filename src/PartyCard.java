
public class PartyCard extends Card {
	
	//To be subclass in the card class for political party cards.
	PartyCard(String title, int value){
		super(title, value);
	}
	
	//Conservative and Labour cards, read from left to right as Cap tax, Rev tax, Interest.
	private String[][][] partyProperties = {conservative, labour};
    /////////////////////////////////////////////////////////////////////	
	private static String[] conservative1 = {"NIL","25","20"};	
	private static String[] conservative2 = {"NIL","25","20"};	
	private static String[] conservative3 = {"NIL","50","10"};
	private static String[] conservative4 = {"25","25","10"};	
	private static String[] conservative5 = {"NIL","NIL","20"};	
	private static String[] conservative6 = {"25","50","10"};
	
		private static String [][] conservative = {conservative1,conservative2,conservative3,conservative4,conservative5,conservative6};
	
		
		private static String[] labour1 = {"75","50","5"};	
		private static String[] labour2 = {"50","25","10"};	
		private static String[] labour3 = {"50","50","5"};
		private static String[] labour4 = {"75","75","5"};	
		
			private static String [][] labour = {labour1,labour2,labour3,labour4};
			
			
			//Can write a method to use RNg to select the party and its card while also passing on the various taxes and
			//rates to the Bank class where they will then be set within that class for the turn.
		
}
