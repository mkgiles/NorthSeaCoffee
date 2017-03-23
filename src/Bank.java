import java.util.ArrayList;

public class Bank {

	static int borrowLimit = 4000000;
	static int victoryGoal = 5000000;
	int capitalRatesTax;
	int revenueRatesTax;
	int interestRate;
	
	//Can hopefully store financials for each player in the player class.
	
	
	//used to control phase 1
	public static void borrowPhase() {
	
		
		System.out.print("borrowPhase");
		//Can use RNG to select the variables for each form of tax and interest from the political party card
		//Can then get those rates from the PartyCard class and set them, here for the turn.
		
	}
	
	
	//Potential method to use in the first and third phases of the game to pay off player debt. If not, concept should
	//hopefully inspire better method. Need to have a way of managing individual player debt as well as inventory.
	
	public static void bankPayment(Player player)
	{	
		IO.putLine("Your debt is " + player.getDebt());

		 int menu = 1;
		 while (menu == 1){
		 {
		  int payment=IO.getInt("How much do you wish to pay your bank?");
			 if(payment < player.getDebt() && payment > -1)
			 {
				 player.payDebt(payment);
				 menu = 0;
			 }
			 else 
			 {
				 IO.putLine("Invalid option entered"); 
			 }
		 }
		}
	}
	
	public static void bankBorrow(Player player)
	{
		 int menu = 1;
		 while (menu == 1){
		IO.putLine("Your debt is " + player.getDebt());
		IO.putLine("How much do you wish to borrow?");
		int borrow=IO.getInt("500000 or 1000000?");
		if(borrow < borrowLimit && (borrow == 500000 || borrow == 1000000 || borrow == 0))
		{
			player.addLoan(borrow);
			menu = 0;
		}
		else 
		{
			IO.putLine("Invalid option entered"); 
		}
	}
	}
	
	//Will be used to check if a player is victorious or bankrupt, using methods in Player. If a player is victorious
	//The harsh but fair ruling of RNGesus will be dealt and the victor shall emerge.
	
	
	public static void playerStateCheck()
	{
    	for(int i=0; i<Player.getPlayerCount();i++){
    		Player player = Player.getPlayer(i);
    		if (player.getCash() <= 0 && player.getDebt() >= 4000000 && player.getConcessionsRemaining() == 7 && player.getDrillCount() == 0 )
    		{
    			Player.playerBankrupt(i);
    			
    		}
    		else{
    			if(player.getCash() >= victoryGoal && player.getDebt() == 0)
    			{
    				Player.playerWinner(i);
    			}
    		}
    	}
	}
	
	//Unfinished
	public static void auction(int menu){
	{
		while(menu !=5){
		double highestBid = 0;
		ArrayList<Double> bids = new ArrayList<Double>();

		
		while(menu == 1){
    	for(int i=0; i<Player.getPlayerCount();i++){
    		IO.printLine(Player.getPlayer(i));
    		String answer = IO.getLine("Do you wish to bid for a concession? Yes or No?");
    		if (answer.toUpperCase().charAt(0)=='Y'){
    			double bid = IO.getDouble("Make your bid!");
    			bids.add(i, bid);
    		}
    		else{
    			IO.putLine("Backed out of the bidding.");
    		}
    		menu = 2;
    	}
		}
    	
    	while(menu == 2){
    	for(int j=0; j<Player.getPlayerCount();j++)
    	{
    		if(bids.get(j) > highestBid)
    		highestBid = bids.get(j);
    		IO.putLine("Bid updated.");
    	}
    	for(int k=0; k<Player.getPlayerCount();k++)
    	{
    		String answer = IO.getLine(Player.getPlayer(k) + ", The highest bid was " + highestBid + " Do you wish to continue the auction?");
    		if (answer.toUpperCase().charAt(0)!='Y')
    		{
    			bids.set(k, (double) -1);
    		}
    	}

    	{
        	for(int i=0; i<Player.getPlayerCount();i++){
        		if(bids.get(i) !=1){
        		IO.printLine(Player.getPlayer(i));
        		String answer = IO.getLine("Do you wish to bid for a concession? Yes or No?");
        		if (answer.toUpperCase().charAt(0)=='Y'){
        			double bid = IO.getDouble("Make your bid!");
        			bids.set(i, bid);
        		}
        		}
        	}
    	}
    	}
		}
	}
	}
}
