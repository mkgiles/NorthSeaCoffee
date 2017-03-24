import java.util.ArrayList;

public class Player {
	private static ArrayList<Player> playerList;
	private int number;
	private String name;
	private ArrayList<Tile> concessions;
	private double cash;
	private double debt;
	private ArrayList<Drill> drills;
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
		this.concessions = new ArrayList<Tile>();
		this.drills = new ArrayList<Drill>();
	}
	public void addConcession(Tile tile){
		this.concessions.add(tile);
	}
	public void dropConcession(Tile tile){
		this.concessions.remove(tile);
	}
	public void buyDrill(Drill drill){
		drills.add(drill);
	}
	public void sellDrill(Drill drill){
		drills.remove(drill);
	}
	public static int getPlayerCount(){
		return playerList.size();
	}
	public static Player getPlayer(int i){
		return playerList.get(i);
	}
	public double addLoan(double amount){
		addCash(amount);
		return this.debt = debt + amount;
	}
	//Adds cash to player
	public void addCash(double addCash)
	{
		this.cash = cash + addCash;
	}
	
	//Removes cash from player
	public void removeCash(double removeCash)
	{
		this.cash = cash - removeCash;
	}
	
	//Gets cash
	public double getCash(){
		return cash;
	}
	
	//Gets debt
	public double getDebt(){
		return debt;
	}
	
	//Pays debt
	public void payDebt(double payment){
		this.debt = debt-payment;
	}
	
	public int getDrillCount(){
		return drills.size();
	}
	public Drill getDrill(int i){
		return drills.get(i);
	}
	public int getConcessionsRemaining(){
		return 7-concessions.size();
	}
	public String toString(){
		return this.name;
	}
	public static void playerBankrupt(int i) {
	playerList.remove(i);
		
	}
	

}
