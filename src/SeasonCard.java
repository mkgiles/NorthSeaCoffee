
public class SeasonCard extends Card{


	//To be subclass in the card class for season cards.
	SeasonCard(String title, int value){
		super(title, value);
	}
		
	//String arrays for seasons. Read from left to right as NW,SW,NE,SE
	private String[][][] seasonProperties = {spring,summer,autumn,winter};
    /////////////////////////////////////////////////////////////////////	
	private static String[] spring1 = {"Good", "Good", "Good", "Good"};	
	private static String[] spring2 = {"Storm", "Storm", "Rough", "Rough"};	
	private static String[] spring3 = {"Rough", "Good", "Rough", "Good"};
	
		private static String [][] spring = {spring1, spring2, spring3};
    /////////////////////////////////////////////////////////////////////
	private static String[] summer1 = {"Storm", "Storm", "Rough", "Good"};	
	private static String[] summer2 = {"Good", "Good", "Good", "Good"};
	
		private static String [][] summer = {summer1,summer2};
    /////////////////////////////////////////////////////////////////////
	private static String[] autumn1 = {"Good", "Good", "Good", "Good"};	
	private static String[] autumn2 = {"Rough", "Good", "Good", "Good"};	
	private static String[] autumn3 = {"Good", "Good", "Rough", "Good"};
	
		private static String [][] autumn = {autumn1,autumn2,autumn3};
	/////////////////////////////////////////////////////////////////////
	private static String[] winter1 = {"Rough", "Rough", "Gale", "Gale"};	
	private static String[] winter2 = {"Gale", "Gale", "Rough", "Rough"};	
	private static String[] winter3 = {"Gale", "Gale", "Storm", "Storm"};
	private static String[] winter4 = {"Good", "Good", "Good", "Good"};
	
		private static String [][] winter = {winter1,winter2,winter3,winter4};	

}
