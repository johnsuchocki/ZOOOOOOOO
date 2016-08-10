package com.zoo;

public class Platypus extends Mammal {

	boolean hasDuckBill = true;

	public Platypus(boolean isAlive, boolean isEndangered, String enclosureType, String habitat, boolean liveBirth,
			boolean isVenomous, String furColor, boolean hasDuckBill) {
		super(isAlive, isEndangered, enclosureType, habitat, false, true, furColor);
		this.hasDuckBill = hasDuckBill;
	}

	public boolean isHasDuckBill() {
		return hasDuckBill;
	}

	public void setHasDuckBill(boolean hasDuckBill) {
		this.hasDuckBill = hasDuckBill;
	}

	
}