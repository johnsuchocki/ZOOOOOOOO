package com.zoo;

public class Penguin extends Bird {

	boolean hasEgg = false;

	public Penguin(boolean isAlive, boolean isEndangered, String enclosureType, String habitat, boolean migrates,
			boolean flies, boolean hasEgg) {
		super(isAlive, isEndangered, enclosureType, habitat, true, false);
		this.hasEgg = hasEgg;
	}

	public boolean isHasEgg() {
		return hasEgg;
	}

	public void setHasEgg(boolean hasEgg) {
		this.hasEgg = hasEgg;
	}

}
