package com.zoo;

public abstract class Amphibian extends Animal {

	boolean currentlyUnderWater = true;

	public Amphibian(boolean isAlive, boolean isEndangered, String enclosureType, String habitat,
			boolean currentlyUnderWater) {
		super(isAlive, isEndangered, enclosureType, habitat);
		this.currentlyUnderWater = currentlyUnderWater;
	}

	public boolean isCurrentlyUnderWater() {
		return currentlyUnderWater;
	}

	public void setCurrentlyUnderWater(boolean currentlyUnderWater) {
		this.currentlyUnderWater = currentlyUnderWater;
	}
	
}