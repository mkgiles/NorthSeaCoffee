import java.util.Scanner;

public class Player {
	
	//All this set to change depending on player storage method. Potential placeholder so far.
	//private String playerName;
	//private int ownershipTokens = 7;
	private static String playerList[];
	
	
	public static void addPlayers(int playerAmount)
	{
		
		for(int i = 0; i < playerAmount; i++ )
		{
			Scanner input = new Scanner(System.in);
			playerList[i] = input.nextLine();
			//Gives an error so far. Need to figure it out but hopefully is a good basis to work from.
		}
	}
	
}
