import java.util.ArrayList;

public class Player {
	
	private static ArrayList<String> playerList;
	public static void addPlayers(int playerAmount)
	{
		playerList = new ArrayList<String>();
		for(int i = 0; i < playerAmount; i++ )
		{
			playerList.add(IO.getLine());
		}
		for(int i=0; i<playerList.size();i++){
			System.out.println(playerList.get(i));
		}
	}
	
}
