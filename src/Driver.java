import java.util.Scanner;

public class Driver {

   public static void main(String[] args) {
       // Create a player with the default constructor
       System.out.println("\n\n****** Create a player using default constructor ******\n");

       Player player1 = new Player();

       // Create a player using inputs and a constructor

       System.out.println("\n\n****** Create a player using inputs and a Constructor ******\n");

       Scanner input = new Scanner(System.in);

       System.out.print("Enter the player's name: ");
       String name = input.nextLine();

       System.out.print("Enter the player's Height: ");
       float height = input.nextFloat();

       System.out.print("Number of Matches Played: ");
       int matchesPlayed = input.nextInt();

       System.out.print("Number of International Caps: ");
       int numIntCaps = input.nextInt();

       System.out.print("Total Goals and Assists: ");
       int goalsAndAssists = input.nextInt();

       input.close();

       Player player2 = new Player(name,  matchesPlayed, numIntCaps,height, goalsAndAssists);

       // Create a player using setters
       System.out.println("\n\n****** Create a player using setters ******\n");

       Player player3 = new Player();

        player3.setName("Norbert");
        player3.setHeight(5.8f);
        player3.setMatchesPlayed(10);
        player3.setNumIntCaps(3);
        player3.setGoalsAndAssists(9);

        // Print all the players that were created

       player1.printPlayer();

       player2.printPlayer();
       player2.printStats();

       player3.printPlayer();
       player3.printStats();

        // Additional test Harness

       System.out.println("\n\n ***** Test harness for player methods not tested above ***** \n\n");

       Player.testHarness();
    }
}
