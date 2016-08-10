package com.zoo;

public class Lizard extends Reptile {

	boolean isGreen = true;

	public Lizard(boolean isAlive, boolean isEndangered, String enclosureType, String habitat,
			boolean currentlyBaskingInSun, boolean isGreen) {
		super(isAlive, isEndangered, "terrarium", habitat, currentlyBaskingInSun);
		this.isGreen = isGreen;
	}

	public boolean isGreen() {
		return isGreen;
	}

	public void setGreen(boolean isGreen) {
		this.isGreen = isGreen;
	}
	
}
