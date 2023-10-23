package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author Shekhar chaudhary
 */
public class ProgramDriver {

	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		// Obtain reference to the singleton instance
		GameService service = GameService.getInstance(); // replaced null with the call to the singleton instance

		System.out.println("\nAbout to test initializing game data...");

		// Initialize with some game data
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);
		
		//Add and print teams
		Team team1 = service.addTeam("Team #1");
		System.out.println(team1);
		Team team2 = service.addTeam("Team #2");
		System.out.println(team2);
		
		//Add and print players
		Player player1 = service.addPlayer("player #1");
		System.out.println(player1);
		Player player2 = service.addPlayer("player #2");
		System.out.println(player2);

		// Use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
