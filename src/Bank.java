
public class Bank {

	int borrowLimit = 4000000;
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
		 int payment=IO.getInt("How much do you wish to pay your bank?");
		 {
			 if(payment < player.getDebt())
			 {
				 player.payDebt(player.getDebt()-payment);
			 }
			 else 
			 {
				 IO.putLine("Invalid option entered"); 
			 }
		 }
	}
	
	
	
}
