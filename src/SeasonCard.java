
public class SeasonCard extends Card{

	private enum Condition{Good, Rough, Storm, Gale};
	Condition[] weather = new Condition[4];
	//To be subclass in the card class for season cards.
	SeasonCard(String title, String value, Condition NW, Condition SW, Condition NE, Condition SE){
		super(title, value);
		weather[0]= NW;
		weather[1]= SW;
		weather[2]= NE;
		weather[3]= SE;
	}
	protected static Card[] cards = {new SeasonCard("Spring","Spring",Condition.Good,Condition.Good,Condition.Good,Condition.Good),new SeasonCard("Spring","Spring",Condition.Storm,Condition.Storm,Condition.Rough,Condition.Rough),new SeasonCard("Spring","Spring",Condition.Rough,Condition.Good,Condition.Rough,Condition.Good),new SeasonCard("Summer","Summer",Condition.Storm,Condition.Storm,Condition.Rough,Condition.Good),new SeasonCard("Summer","Summer",Condition.Good,Condition.Good,Condition.Good,Condition.Good),new SeasonCard("Autumn","Autumn",Condition.Good,Condition.Good,Condition.Good,Condition.Good),new SeasonCard("Autumn","Autumn",Condition.Rough,Condition.Good,Condition.Good,Condition.Good),new SeasonCard("Autumn","Autumn",Condition.Rough,Condition.Good,Condition.Rough,Condition.Good),new SeasonCard("Winter","Winter",Condition.Rough,Condition.Rough,Condition.Gale,Condition.Gale),new SeasonCard("Winter","Winter",Condition.Gale,Condition.Gale,Condition.Rough,Condition.Rough),new SeasonCard("Winter","Winter",Condition.Gale,Condition.Storm,Condition.Good,Condition.Storm),new SeasonCard("Winter","Winter",Condition.Good,Condition.Good,Condition.Good,Condition.Good)};
	protected static void loadDeck(Deck deck){
		for(int i = 0; i<cards.length;i++){
			deck.add(cards[i]);
		}
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
	public String toString(){
		return title + "|" + value + "|" + weather[0] + weather[1] + weather[2] + weather[3];
				
	}
}
