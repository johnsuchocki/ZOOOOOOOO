package com.zoo;

public class Gorilla extends Mammal {
	
	String breed = null;

	public Gorilla(boolean isAlive, boolean isEndangered, String enclosureType, String habitat, boolean liveBirth,
			boolean isVenomous, String furColor, String breed) {
		super(isAlive, true, enclosureType, habitat, liveBirth, isVenomous, furColor);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	

}
