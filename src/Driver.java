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

    	//PHASE 1;
    	
    	///////////////////Doesn't lead onto phase 2 yet. Generates an error.///////////////////
    	//Borrowing
    	for(int i=0; i<Player.getPlayerCount();i++){
    		IO.printLine(Player.getPlayer(i));
    		int answer = IO.getInt("Do you wish to borrow? Yes or No?");
    		if (answer == 1){
    		Bank.bankBorrow(Player.getPlayer(i));
    		}
    		else
    		{
    			IO.putLine("Nothing borrowed.");
    		}
    	}
    	//Paying	
    	for(int j=0; j<Player.getPlayerCount();j++){
    		IO.printLine(Player.getPlayer(j));
    		int answer2 = IO.getInt("Do you wish to repay debt? Yes or No?");
    		if (answer2 == 1){
    		Bank.bankPayment(Player.getPlayer(j));
    		}
    		else
    		{
    			IO.putLine("No payment made.");
    		}
    	}
    	IO.prompt("Press any key to continue to Phase 2");
    	///////////////////Doesn't lead onto phase 2 yet. Generates an error.///////////////////
    	
    	
    	//PHASE 2
    	IO.printLine(map);
    	for(int k=0; k<Player.getPlayerCount();k++){
    		IO.printLine(Player.getPlayer(k));
    		String coordinate = IO.getLine("Pick a concession to purchase");
    		map.purchase(Player.getPlayer(k), coordinate);
    		coordinate = IO.getLine("Pick a concession to sell");
    		map.sell(Player.getPlayer(k), coordinate);
    	}
    	IO.prompt("Press any key to continue to Phase 3");
    	//PHASE 3
    }
}