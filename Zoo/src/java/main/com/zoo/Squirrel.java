package com.zoo;

public class Squirrel extends Mammal {

	boolean isEatingTrash = true;

	public Squirrel(boolean isAlive, boolean isEndangered, String enclosureType, String habitat, boolean liveBirth,
			boolean isVenomous, String furColor, boolean isEatingTrash) {
		super(isAlive, false, enclosureType, habitat, liveBirth, isVenomous, furColor);
		this.isEatingTrash = isEatingTrash;
	}

	public boolean isEatingTrash() {
		return isEatingTrash;
	}

	public void setEatingTrash(boolean isEatingTrash) {
		this.isEatingTrash = isEatingTrash;
	}
	
}
