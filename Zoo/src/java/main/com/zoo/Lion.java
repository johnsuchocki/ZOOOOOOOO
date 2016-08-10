package com.zoo;

public class Lion extends Mammal {
	
	String roarSound = "roar";

	public Lion(boolean isAlive, boolean isEndangered, String enclosureType, String habitat, boolean liveBirth,
			boolean isVenomous, String furColor, String roarSound) {
		super(isAlive, isEndangered, enclosureType, habitat, liveBirth, isVenomous, furColor);
		this.roarSound = roarSound;
	}

	public String getRoarSound() {
		return roarSound;
	}

	public void setRoarSound(String roarSound) {
		this.roarSound = roarSound;
	}
	
}
