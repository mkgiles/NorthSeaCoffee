import java.util.ArrayList;

public class Bank {

	private static ArrayList<Player> winner;
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
		IO.putLine("Your cash is " + player.getCash());
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
	    IO.putLine("Your cash is " + player.getCash());
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
		winner = new ArrayList<Player>();
    	for(int i=0; i<Player.getPlayerCount();i++){
    		Player player = Player.getPlayer(i);
    		if (player.getCash() <= 0 && player.getDebt() >= 4000000 && player.getConcessionsRemaining() == 7 && player.getDrillCount() == 0 )
    		{
    			Player.playerBankrupt(i);
    			
    		}
    		else{
    			if(player.getCash() >= victoryGoal && player.getDebt() == 0)
    			{
    				winner.add(Player.getPlayer(i));
    				
    				
    				
    			}
    			if(winner.contains(player)){
    			playerWinner(winner.size());
    		}
    		}
    	}
	}
	
	//Start of a victory check in Player. Will eventually determine winner between multiple winners
	public static void playerWinner(int i) {
		IO.putLine(Player.getPlayer(i) + "has won!");
		
	}

	public static void bidWar(Tile tile, Deck waterDeck){
		double[] bids = new double[Player.getPlayerCount()];
		double highestBid = 0.0;
		int bidders = bids.length;
		Player highestBidder = null;
		while(bidders > 1){
			for(int i = 0; i<bids.length; i++){
				if(bids[i]>=0){
					if(Player.getPlayer(i)!=highestBidder){
						if(highestBidder!=null){
							IO.putLine("Highest Bidder: " + highestBidder);
							IO.putLine("Highest bid is currently: " + highestBid);
						}
						IO.printLine(Player.getPlayer(i));
						if(IO.getLine("Do you want to bid?").toUpperCase().charAt(0)=='Y'){
							double bid=IO.getDouble("Enter Bid amount: ");
							if(Player.getPlayer(i).getCash()>=bid){
								bids[i]=bid;
								if(bid > highestBid){
									highestBid = bid;
									highestBidder = Player.getPlayer(i);
								}
							}
							else{
								IO.putLine("Insufficient Funds.");
							}
						}
					else{
						bids[i]=-1;
						bidders--;
					}
					}
				}
			}
		}
		if(highestBidder!=null){
			IO.putLine("Auction goes to: " + highestBidder + "!");
			highestBidder.removeCash(highestBid);
			highestBidder.addConcession(tile);
			tile.purchase(highestBidder);
			if(tile.getCard()==null){
				tile.addCard((WaterCard)waterDeck.read());
				IO.print(tile.getCard().title + "|" + tile.getCard().back);
			}
		}
	}
}
 