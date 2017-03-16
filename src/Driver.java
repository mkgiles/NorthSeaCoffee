public class Driver {
	
	//Will be used to control the for loop as a victory will stop the loop from continuing
	Deck deck;
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bank bank = new Bank();
		Map map = new Map();
		Player player = new Player();
		Boolean victoryState = false;
		driver.deck = new Deck(true);

        driver.runGameMenu();
        
        //Running state for game. Only displays text so far and has prompts to ensure it doesn't create an infinite, Eclipse-crashing death loop
        //Need to work on a way to escape runGameMenu to get to the while loop.
		while(victoryState != true)
        {
        	driver.gameRunning();
        	IO.putLine("Press Enter to run next loop.");
        }
		
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
    
    
    //Methods for each phase of the game.
    private void gameRunning(){
    //Bank.borrowPhase();	
    //Drill.drillPhase();
    //Card.activityPhase();
    deck.shuffle();
    System.out.println(deck);
    }
}