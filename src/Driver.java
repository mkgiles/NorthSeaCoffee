public class Driver {
	
	//Will be used to control the for loop as a victory will stop the loop from continuing
	Deck waterDeck, partyDeck, weatherDeck, barrelDeck;
	Card partyCard, weatherCard, barrelCard;
	Map map;
	Boolean victoryState;
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bank bank = new Bank();
		driver.map = new Map();
		Deck.deckInit();
		driver.waterDeck = new Deck();
		driver.partyDeck = new Deck();
		driver.weatherDeck = new Deck();
		driver.barrelDeck = new Deck();
		PartyCard.loadDeck(driver.partyDeck);
		WaterCard.loadDeck(driver.waterDeck);
		SeasonCard.loadDeck(driver.weatherDeck);
		BarrelCard.loadDeck(driver.barrelDeck);
		driver.partyDeck.shuffle();
		driver.waterDeck.shuffle();
		driver.weatherDeck.shuffle();
		driver.barrelDeck.shuffle();
		IO.print(driver.barrelDeck);
		IO.print(driver.waterDeck);
		IO.print(driver.weatherDeck);
		IO.print(driver.partyDeck);
		driver.victoryState = false;
		IO.putLine("Welcome to North Sea Oil");
		Drill[] drills = new Drill[13];
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
    	
    	//Borrowing
    	for(int i=0; i<Player.getPlayerCount();i++){
    		IO.printLine(Player.getPlayer(i));
    		String answer = IO.getLine("Do you wish to borrow? Yes or No?");
    		if (answer.toUpperCase().charAt(0)=='Y'){
    		Bank.bankBorrow(Player.getPlayer(i));
    		}
    		else
    		{
    			IO.putLine("Nothing borrowed.");
    		}
    		answer = null;
    	//Paying	
    	//Generates error upon selecting NULL for Yes/No answer.
    		answer = IO.getLine("Do you wish to repay debt? Yes or No?");
    		if (answer.toUpperCase().charAt(0)=='Y'){
    		Bank.bankPayment(Player.getPlayer(i));
    		}
    		else
    		{
    			IO.putLine("No payment made.");
    		}
    		
    	}
    	IO.prompt("Press any key to continue to Phase 2");
    	
    	
    	//PHASE 2
    	IO.printLine(map);
    	for(int i=0; i<Player.getPlayerCount();i++){
    		Player player = Player.getPlayer(i);
    		IO.printLine(player);
    		int option = -1;
    		while(option != 0){
    			String coordinate = null;
    			int type = -1;
    			Drill drill = null;
	        	option = IO.getInt("Pick an option:\n 1: Bid on a concession\n 2: Sell a concession\n 3: Purchase a drill\n 4: Sell a drill\n 5: Test a concession site\n 6: Place a Drill\n 7: Displace a Drill\n 8: Transfer a Drill 0: End turn");
	    		switch(option){
	    		case(1):
		    		coordinate = IO.getLine("Pick a concession to auction for.");
		    		map.purchase(player, coordinate, waterDeck);
		    		//Bank.auction(1);
		    		break;
	    		case(2):
		    		coordinate = IO.getLine("Pick a concession to sell");
		    		map.sell(player, coordinate);
		    		break;
	    		case(3):
	    			IO.putLine("Your cash is " + player.getCash());
	    		IO.putLine("0)Light drill. ($100,000)");
	    		IO.putLine("1)Heavy drill. ($250,000)");
	    		IO.putLine("2)Special drill. ($500,000)");
	    		IO.putLine("3)Go back to menu.");
		    		type = IO.getInt("Pick a drill type to purchase");
		    		drill = null;
		    		if(type < 3 && type > -1){
		    		for(int j = 0; j<Drill.drillList.length;j++){
		    			if(Drill.drillList[j].getType() == type){
		    				if(Drill.drillList[j].getOwner() == null){
		    					drill=Drill.drillList[j];
		    					drill.purchase(player);
		    					player.buyDrill(drill);
		    					break;
		    				}
		    			}
		    		}
		    		}
		    		if(drill == null && type >-1 && type < 3){
		    			IO.putLine("NO DRILLS LEFT!");
		    		}
		    		
		    		if(drill == null && type > 2){
		    			IO.putLine("Suit yourself.");
		    		}
		    		break;
	    		case(4):
		    		IO.putLine("0)Light drill. ($60,000)");
		    		IO.putLine("1)Heavy drill. ($250,000)");
		    		IO.putLine("2)Special drill. ($300,000)");
		    		IO.putLine("3)Go back to menu.");
		    		type = IO.getInt("Pick a drill type to sell");
		    		drill = null;
		    		if(type < 3 && type > -1){
		    		for(int j = 0; j<player.getDrillCount();j++){
		    			if(player.getDrill(j).getType() == type){
		    				if(Drill.drillList[j].getTile() != null){
		    					drill=Drill.drillList[j];
		    					drill.sell();
		    					player.sellDrill(drill);
		    					break;
		    				}
		    			}
		    			else{
		    				IO.putLine("No Drill of that type.");
		    			}
		    		}
		    		}
		    		break;
	    		case(5):
	    			coordinate = IO.getLine("Pick a concession to test");
	    			map.peek(player, coordinate,waterDeck);
	    			break;
	    		case(6):
	    			coordinate = IO.getLine("Pick a concession to add a drill to");
	    			Tile addDrill = map.tileMap.get(coordinate);
	    			String depth = addDrill.getCard().title;
	    			for(int j=0; j<player.getDrillCount();j++){
	    				Drill addingDrill = player.getDrill(j);
	    				if((depth == "Shallow Water" && addingDrill.getType() == 0)||(depth == "Deep Water" && addingDrill.getType() == 1)||(depth == "Reef" && addingDrill.getType() == 2)){
	    					addingDrill.place(addDrill);
	    					addDrill.setDrill(addingDrill);
	    					break;
	    				}
	    			}
	    			break;
	    		case(7):
	    			coordinate = IO.getLine("Pick a concession to remove a drill from");
	    			Tile removeDrill = map.tileMap.get(coordinate);
	    			removeDrill.getDrill().displace();
	    			removeDrill.dropDrill();
	    			break;
	    		case(8):
	    			coordinate = IO.getLine("Pick a concession to transfer from");
	    			Tile fromConc = map.tileMap.get(coordinate);
	    			coordinate = IO.getLine("Pick a concession to transfer to");
	    			Tile toConc = map.tileMap.get(coordinate);
	    			fromConc.getDrill().place(toConc);
	    			toConc.setDrill(fromConc.getDrill());
	    			fromConc.dropDrill();
	    			break;
	    		case(0):
	    			break;
	    		default:
	    			IO.putLine("Invalid option");
	    			break;
    		}
    	}
    }
    	IO.prompt("Press any key to continue to Phase 3");
    	//PHASE 3
    
    	
    	//LAST METHOD
    for(int i=0; i<Player.getPlayerCount();i++)
    {
     Bank.playerStateCheck();
    }
}
}
