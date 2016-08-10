package com.zoo;

public abstract class Bird extends Animal {

	boolean migrates = true;
	boolean flies = true;
	
	public Bird(boolean isAlive, boolean isEndangered, String enclosureType, String habitat, boolean migrates,
			boolean flies) {
		super(isAlive, isEndangered, enclosureType, habitat);
		this.migrates = migrates;
		this.flies = flies;
	}

	public boolean isMigrates() {
		return migrates;
	}

	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}

	public boolean isFlies() {
		return flies;
	}

	public void setFlies(boolean flies) {
		this.flies = flies;
	}
		
}
