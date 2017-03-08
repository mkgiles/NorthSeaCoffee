import java.util.Scanner;

public class Driver {
	Scanner input = new Scanner(System.in);

	
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bank bank = new Bank();
		Cards cards = new Cards();
		Map map = new Map();
		Player player = new Player();


		
		driver.gameMenu();
		driver.runGameMenu();
		
		}
	
	//Input for player amount and player names.
		
	public int gameMenu()
	{
		 System.out.println("Welcome to North Sea Oil");
		 System.out.println("How many players would you like to play with? (2-6)");
		 System.out.println("1) 2 Players");
		 System.out.println("2) 3 Players");
		 System.out.println("3) 4 Players");
		 System.out.println("4) 5 Players");
		 System.out.println("5) 6 Players");
	        int option = input.nextInt();
	        return option;
	}

    private void runGameMenu()
    {
        int option = gameMenu();
        while (option != 0)
        {
           
            switch (option)
            {
               case 2:    System.out.println("2 Players");
               			  Player.addPlayers(2);
            	          break;
               case 3:    System.out.println("3 Players");
               			  Player.addPlayers(3);
                          break;
               case 4:    System.out.println("4 Players");
               			  Player.addPlayers(4);
               			  break;
               case 5:    System.out.println("5 Players");
               			  Player.addPlayers(5);
               			  break;
               case 6:    System.out.println("6 Players");
                          Player.addPlayers(6);
               			  break;
              default:    System.out.println("Invalid option entered: " + option);
                          break;
            }
            System.out.println("\nPress any key to continue...");
            input.nextLine();
            input.nextLine(); 
            
            option = gameMenu();
        }
    }
	

}
