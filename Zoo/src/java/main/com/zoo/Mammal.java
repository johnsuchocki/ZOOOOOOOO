package com.zoo;

public abstract class Mammal extends Animal {

	boolean liveBirth = true;
	boolean isVenomous = false;
	String furColor = null;
	
	public Mammal(boolean isAlive, boolean isEndangered, String enclosureType, String habitat, boolean liveBirth, boolean isVenomous,
			String furColor) {
		super(isAlive, isEndangered, enclosureType, habitat);
		this.liveBirth = liveBirth;
		this.isVenomous = isVenomous;
		this.furColor = furColor;
	}

	public boolean isLiveBirth() {
		return liveBirth;
	}

	public void setLiveBirth(boolean liveBirth) {
		this.liveBirth = liveBirth;
	}

	public boolean isVenomous() {
		return isVenomous;
	}

	public void setVenomous(boolean isVenomous) {
		this.isVenomous = isVenomous;
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
}
