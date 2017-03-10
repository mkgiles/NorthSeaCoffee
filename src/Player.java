import java.util.ArrayList;

public class Player {
	
	private static ArrayList<String> playerList;
	public static void addPlayers(int playerAmount)
	{
		playerList = new ArrayList<String>();
		for(int i = 0; i < playerAmount;)
		{
			//Putting increments in IO to maintain correct mapping in player number and index number. 
			playerList.add(IO.getLine("Enter Name of Player " + ++i + ": "));
		}
		for(int i=0; i<playerList.size(); i++){
			//increment gets player number.
			IO.putLine("Player " + ++i + ": ");
			//decrement gets index number.
			IO.putLine(playerList.get(--i));
		}
	}
	
}
