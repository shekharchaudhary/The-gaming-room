package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
//import java.util.Iterator;

/**
 * A singleton service for the game engine
 * 
 * @author shekhar chaudhary
 */
public class GameService {

	/**
	 * A list of the active games, teams and player
	 */
	private static List<Game> games = new ArrayList<Game>();
	private static List<Team> teams = new ArrayList<Team>();
	private static List<Player> players = new ArrayList<Player>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	/*
	 * Holds the next team identifier
	 */
	private static long nextTeamId = 1;
	/*
	 * Holds the next player identifier
	 */
	private static long nextPlayerId = 1;


	// The single instance for the singleton
	private static GameService instance;

	// Private constructor for singleton pattern
	private GameService() {
	}

	// Public method to get the singleton instance
	public static GameService getInstance() {
		if (instance == null) {
			instance = new GameService();
		}
		return instance;
	}
	
	/**
	 * Construct a new team instance
	 * 
	 * @param name the unique name of the team
	 * @return the team instance (new or existing)
	 */
	
	public Team addTeam (String name) {
		for (Team existingTeam : teams) {
			if(existingTeam.getName().equals(name)) {
				return existingTeam;
			}
		}
		Team team = new Team(nextTeamId++, name);
		teams.add(team);
		return team;
	}
	
	/**
	 * Construct a new player instance
	 * 
	 * @param name the unique name of the player
	 * @return the player instance (new or existing)
	 */
	
	public Player addPlayer (String name) {
		for (Player existingPlayer : players) {
			if(existingPlayer.getName().equals(name)) {
				return existingPlayer;
			}
		}
		Player player = new Player(nextPlayerId++, name);
		players.add(player);
		return player;
	}
	
	
	

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {
		// Use iterator to look for existing game with same name
		for (Game existingGame : games) {
			if (existingGame.getName().equals(name)) {
				return existingGame;
			}
		}

		// If not found, make a new game instance and add to list of games
		Game game = new Game(nextGameId++, name);
		games.add(game);

		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * 
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}

	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {
		for (Game existingGame : games) {
			if (existingGame.getId() == id) {
				return existingGame;
			}
		}
		return null;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {
		for (Game existingGame : games) {
			if (existingGame.getName().equals(name)) {
				return existingGame;
			}
		}
		return null;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}

