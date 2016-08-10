package com.zoo;

public class Frog extends Amphibian {

	String lifeCycleStage = "tadpole";

	public Frog(boolean isAlive, boolean isEndangered, String enclosureType, String habitat,
			boolean currentlyUnderWater, String lifeCycleStage) {
		super(isAlive, isEndangered, enclosureType, habitat, currentlyUnderWater);
		this.lifeCycleStage = lifeCycleStage;
	}

	public String getLifeCycleStage() {
		return lifeCycleStage;
	}

	public void setLifeCycleStage(String lifeCycleStage) {
		this.lifeCycleStage = lifeCycleStage;
	}

}
