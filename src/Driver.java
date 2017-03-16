public class Driver {

	//Will be used to control the for loop as a victory will stop the loop from continuing
	int victoryState = 1;
	Deck deck;
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bank bank = new Bank();
		Map map = new Map();
		Player player = new Player();
		driver.deck = new Deck(true);

		driver.runGameMenu();
		
		}
	
	//Input for player amount and player names.
		
	public int gameMenu()
	{
		 IO.putLine("Welcome to North Sea Oil");
		 int option=IO.getInt("How many players would you like to play with? (2-6)");
	     return option;
	}

    private void runGameMenu()
    {
        int option = 0;
        while (option != -1)
        {
           option = gameMenu();
           if(option > 1 && option <= 6){
        	   IO.putLine(option + " players");
        	   Player.addPlayers(option);
           }
           else if(option == 0){
        	   IO.putLine("SHUFFLE!");
           }
           else{
        	   IO.putLine("Invalid option entered: " + option);     
           }
           IO.prompt("Press any key to continue...");
           gameRunning(); 
        }
        
    }
    
    
    //Running state for game, foundation. Tried to test with prints but not working just yet. Will pick up to continue.
    private void gameRunning()
    {
    //Bank.borrowPhase();	
    //Drill.drillPhase();
    //Card.activityPhase();
    deck.shuffle();
    System.out.println(deck);
    }
}