package com.zoo;

public class Human extends Mammal {

	boolean isChild = false;
	public String role = "visitor";
	
	public Human(boolean isAlive, boolean isEndangered, String enclosureType, String habitat, boolean liveBirth,
			boolean isVenomous, String furColor, boolean isChild, String role) {
		super(isAlive, isEndangered, "none", "everywhere", true, false, furColor);
		this.isChild = isChild;
		this.role = role;
	}

	public boolean isChild() {
		return isChild;
	}

	public void setChild(boolean isChild) {
		this.isChild = isChild;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	/*public String printString() {
		String person = null;
		if(isChild) {
			person = "child.";
		} else {
			person = "adult.";
		}
		String endangered = null;
		if(isEndangered) {
			endangered = "an endangered ";
		} else {
			endangered = "a safe ";
		}
		return ("I saw " + endangered + person);
	} */
}
