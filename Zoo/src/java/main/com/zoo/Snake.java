package com.zoo;

public class Snake extends Reptile {

	boolean speaksParselTongue = false;

	public Snake(boolean isAlive, boolean isEndangered, String enclosureType, String habitat,
			boolean currentlyBaskingInSun, boolean speaksParselTongue) {
		super(isAlive, isEndangered, enclosureType, "woodlands", currentlyBaskingInSun);
		this.speaksParselTongue = speaksParselTongue;
	}

	public boolean isSpeaksParselTongue() {
		return speaksParselTongue;
	}

	public void setSpeaksParselTongue(boolean speaksParselTongue) {
		this.speaksParselTongue = speaksParselTongue;
	}
	
}
