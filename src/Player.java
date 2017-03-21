import java.util.ArrayList;

public class Player {
	private static ArrayList<Player> playerList;
	private int number;
	private String name;
	private Tile[] concessions;
	private int concessionCount = 0;
	public static void addPlayers(int playerAmount)
	{
		playerList = new ArrayList<Player>();
		for(int i = 0; i < playerAmount;)
		{
			//Putting increments in IO to maintain correct mapping in player number and index number. 
			playerList.add(new Player(IO.getLine("Enter Name of Player " + ++i + ": "),i));
		}
		for(int i=0; i<playerList.size(); i++){
			//increment gets player number.
			IO.putLine("Player " + ++i + ": ");
			//decrement gets index number.
			IO.printLine(playerList.get(--i));
		}
	}
	Player(String name, int number){
		this.name = name;
		this.number = number;
		this.concessions = new Tile[7];
	}
	public void addConcession(Tile tile){
		this.concessions[concessionCount++] = tile;
	}
	public static int getPlayerCount(){
		return playerList.size();
	}
	public static Player getPlayer(int i){
		return playerList.get(i);
	}
	public double getDebt(){
		return 0.0;
	}
	public void payDebt(double payment){
		
	}
	public int getConcessionsRemaining(){
		return concessions.length-concessionCount;
	}
	public String toString(){
		return this.name;
	}
}
