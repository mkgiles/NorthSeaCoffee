
public class Bank {

	int borrowLimit = 4000000;
	int capitalRatesTax;
	int revenueRatesTax;
	
	
	//Can hopefully store financials for each player in the player class.
	
	
	//used to control phase 1
	public static void borrowPhase() {
	
		
		System.out.print("borrowPhase");
	}
	
	
	//Potential method to use in the first and third phases of the game to pay off player debt. If not, concept should
	//hopefully inspire better method. Need to have a way of managing individual player debt as well as inventory.
	public static void bankPayment()
	{	
		 int payment=IO.getInt("How much do you wish to pay your bank?");
		 {
			 if(payment < player.getDebt)
			 {
				 player.paydebt(player.getDebt-payment);
			 }
			 else 
			 {
				 IO.putLine("Invalid option entered"); 
			 }
		 }
	}
	
	
	
}
