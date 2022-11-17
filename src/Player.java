public class Player {

    private String name;
    private int matchesPlayed;
    private int numIntCaps;
    private float height;
    private int goalsAndAssists;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getNumIntCaps() {
        return numIntCaps;
    }

    public void setNumIntCaps(int numIntCaps) {
        this.numIntCaps = numIntCaps;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getGoalsAndAssists() {
        return goalsAndAssists;
    }

    public void setGoalsAndAssists(int goalsAndAssists) {
        this.goalsAndAssists = goalsAndAssists;
    }

    public void setAll(String name, int matchesPlayed, int numIntCaps, float height, int goalsAndAssists) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.numIntCaps = numIntCaps;
        this.height = height;
        this.goalsAndAssists = goalsAndAssists;
    }

    // Overloaded constructors to build the object using 0, 2, 3 or 5 arguments
    public Player() {
        System.out.println("Player Created with no variables (Use default constructor)");
    }

    public Player(String name, int matchesPlayed) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
    }

    public Player(String name, int matchesPlayed, float height) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.height = height;
    }
    public Player(String name, int matchesPlayed, int numIntCaps, float height, int goalsAndAssists) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.numIntCaps = numIntCaps;
        this.height = height;
        this.goalsAndAssists = goalsAndAssists;
    }

    // Method to print all the data on a player to the console
    public void printPlayer() {
        System.out.println("Player: " + name +
                "\nHeight: " + height +
                "\nMatches Played: " + matchesPlayed +
                "\nInternational Caps: " + numIntCaps +
                "\nGoals and Assists: " + goalsAndAssists + "\n");
    }

    // Method to calculate and print the player name and goals&assists per match
    public void printStats() {
        float gaPerMatch = goalsAndAssists / (float)matchesPlayed;

        System.out.println(name + " scores an average of " + gaPerMatch + " goals and/or assists per match\n");
    }

    public static void testHarness() {
        // To test functionality currently not leveraged in the Driver

        System.out.println("Test Harness");

        // Constructors:

        System.out.println("\nTesting Constructors");

        Player testPlayer1 = new Player("John", 2);
        testPlayer1.printPlayer();

        System.out.println();

        Player testPlayer2 = new Player("Sam", 4, 5.7f);
        testPlayer2. printPlayer();

        // Full Setter:

        System.out.println("\nTesting Constructors");

        Player testPlayer3 = new Player();
        testPlayer3.setAll("Gru",5,3,4.7f,10);

        // Getters:

        System.out.println("\nTesting Getters");

        System.out.println("Name: " + testPlayer3.getName());
        System.out.println("Height: " + testPlayer3.getHeight());
        System.out.println("Games Played: " + testPlayer3.getMatchesPlayed());
        System.out.println("International Caps: " + testPlayer3.getNumIntCaps());
        System.out.println("Goals & Assists: " + testPlayer3.getGoalsAndAssists());
    }
}
