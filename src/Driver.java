public class Driver {

	
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bank bank = new Bank();
		Map map = new Map();
		Player player = new Player();

		driver.runGameMenu();
		
		}
	
	//Input for player amount and player names.
		
	public int gameMenu()
	{
		 IO.putLine("Welcome to North Sea Oil");
		 int option=IO.getInt("How many players would you like to play with? (2-6)");
	     return option;
	}

    private void runGameMenu()
    {
        int option = gameMenu();
        while (option != -1)
        {
           
            switch (option)
            {
               case 2:    IO.putLine("2 Players");
               			  Player.addPlayers(2);
            	          break;
               case 3:    IO.putLine("3 Players");
               			  Player.addPlayers(3);
                          break;
               case 4:    IO.putLine("4 Players");
               			  Player.addPlayers(4);
               			  break;
               case 5:    IO.putLine("5 Players");
               			  Player.addPlayers(5);
               			  break;
               case 6:    IO.putLine("6 Players");
                          Player.addPlayers(6);
               			  break;
              default:    IO.putLine("Invalid option entered: " + option);
                          break;
            }
            IO.prompt("Press any key to continue...");
            
            option = gameMenu();
        }
    }
	

}
