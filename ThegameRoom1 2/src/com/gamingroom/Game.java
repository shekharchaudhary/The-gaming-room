package com.gamingroom;
//
///**
// * A simple class to hold information about a game
// * 
// * <p>
// * Notice the overloaded constructor that requires
// * an id and name to be passed when creating.
// * Also note that no mutators (setters) defined so
// * these values cannot be changed once a game is
// * created.
// * </p>
// * 
// * @author Shekhar Chaudhary
// *
// */
//*/ extending entity class to use its property
public class Game extends Entity {


	/**
	//* Constructor with an identifier and name
	*/
	public Game(long id, String name) {
		super(id, name);
	}

	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}

}


