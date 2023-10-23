package com.gamingroom;
//
///**
// * A simple class to hold information about a entity
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

public class Entity {
	protected long id;
	protected String name;
	
	protected Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name +"]";
	}
}



