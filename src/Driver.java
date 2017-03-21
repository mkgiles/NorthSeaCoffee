public class Driver {
	
	//Will be used to control the for loop as a victory will stop the loop from continuing
	Deck deck;
	Map map;
	Boolean victoryState;
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bank bank = new Bank();
		driver.map = new Map();
		Deck.deckInit();
		driver.deck = new Deck();
		driver.victoryState = false;
		IO.putLine("Welcome to North Sea Oil");
        driver.runGameMenu();
        
        //Running state for game. Only displays text so far and has prompts to ensure it doesn't create an infinite, Eclipse-crashing death loop
        //Need to work on a way to escape runGameMenu to get to the while loop.
		while(!driver.victoryState)
        {
        	driver.gameRunning();
        }
		
	}
	//Input for player amount and player names.
		
	public int gameMenu()
	{
		 int option=IO.getInt("How many players would you like to play with? (2-6)");
	     return option;
	}

    private void runGameMenu()
    {
        int option = 0;
        boolean valid = false;
        while (!valid)
        {
           option = gameMenu();
           if(option > 1 && option <= 6){
        	   IO.putLine(option + " players");
        	   Player.addPlayers(option);
        	   valid = true;
           }
           else{
        	   IO.putLine("Invalid option entered: " + option);     
           }
           IO.prompt("Press any key to continue...");
        }
    }
    
    
    //Methods for each phase of the game.
    private void gameRunning(){
    //	Bank.borrowPhase();	
    //	Drill.drillPhase();
    //	Card.activityPhase();
    	IO.printLine(map);
    	for(int i=0; i<Player.getPlayerCount();i++){
    		IO.printLine(Player.getPlayer(i));
    		String coordinate = IO.getLine("Pick a concession to purchase");
    		map.purchase(Player.getPlayer(i), coordinate);
    		coordinate = IO.getLine("Pick a concession to sell");
    		map.sell(Player.getPlayer(i), coordinate);
    	}
    	IO.prompt("Press any key to continue...");
    }
}