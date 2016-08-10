package com.zoo;

public class Duck extends Bird {

	boolean isQuacking = true;

	public Duck(boolean isAlive, boolean isEndangered, String enclosureType, String habitat, boolean migrates,
			boolean flies, boolean isQuacking) {
		super(isAlive, false, enclosureType, habitat, true, true);
		this.isQuacking = isQuacking;
	}

	public boolean isQuacking() {
		return isQuacking;
	}

	public void setQuacking(boolean isQuacking) {
		this.isQuacking = isQuacking;
	}
	
}
