public class Driver {
	
	//Will be used to control the for loop as a victory will stop the loop from continuing
	
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bank bank = new Bank();
		Map map = new Map();
		Player player = new Player();
		Boolean victoryState = false;


        driver.runGameMenu();
        
        //Running state for game. Only displays text so far and has prompts to ensure it doesn't create an infinite, Eclipse-crashing death loop
        //Need to work on a way to escape runGameMenu to get to the while loop.
		while(victoryState != true)
        {
        	Driver.phaseOne();
        	IO.prompt("Press any key to continue to phase two.");
        	Driver.phaseTwo();
        	IO.prompt("Press any key to continue to phase three.");
        	Driver.phaseThree();
        	IO.prompt("Press any key to start the next turn.");
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
       int option = gameMenu();
       if(option > 1 && option <= 6){
    	   IO.putLine(option + " players");
    	   Player.addPlayers(option);
       }
       else{
    	   IO.putLine("Invalid option entered: " + option);     
       }
       IO.prompt("Press any key to continue...");
    }
    
    
    //Methods for each phase of the game.
    private static void phaseOne()
    {
    	Bank.borrowPhase();
    	//Bank.bankPayment();
    }
    private static void phaseTwo()
    {
    	Drill.drillPhase();
    }
    private static void phaseThree()
    {
    	Card.activityPhase();
    	//Bank.bankPayment();
    }
}