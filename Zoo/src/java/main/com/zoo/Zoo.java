package com.zoo;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		
		//Instantiating and storing objects into ArrayLists for later looping/printing fun
		
		Human littleTimmy = new Human(true, true, "none", "everywhere", true, false, "brown hair", true, "visitor");
		Human irresponsibleMother = new Human(true, false, "none", "everywhere", true, false, "brown hair", false, "visitor");
		Human bob = new Human(true, false, "none", "everywhere", true, false, "red hair", false, "zoo keeper");
		
		ArrayList<Human> zooHumans = new ArrayList<>();
		zooHumans.add(littleTimmy); 
		zooHumans.add(irresponsibleMother); 
		zooHumans.add(bob); 
		
		Gorilla harumbe = new Gorilla(false, true, "cage", "jungle", true, false, "black", "western lowlands Silverback");
				
		Lion simba = new Lion(true, false, "cage", "savanah", true, false, "golden yellow", "roar");
		Lion mufasa = new Lion(false, false, "cage", "savanah", true, false, "golden yellow", "ROARRR");
		Lion scar = new Lion(false, false, "cage", "bone yard", true, false, "red", "mwahahaha");
		
		ArrayList<Lion> zooLions = new ArrayList<>();
		zooLions.add(simba); 
		zooLions.add(mufasa); 
		zooLions.add(scar);
		
		Platypus plato = new Platypus(true, false, "cage", "wetlands", false, true, "black", true);
				
		Squirrel sandy = new Squirrel(true, false, "none", "woodlands", true, false, "brown", true);
		Squirrel sam = new Squirrel(true, false, "none", "woodlands", false, false, "black", true);
		
		ArrayList<Squirrel> zooSquirrels = new ArrayList<>();
		zooSquirrels.add(sandy);
		zooSquirrels.add(sam);
		
		Frog tad = new Frog(true, false, "pond", "ponds", true, "tadpole");
		Frog pollie = new Frog(true, false, "pond", "ponds", true, "polliwog"); 
		Frog frank = new Frog(true, false, "pond", "ponds", false, "adult frog");
		
		ArrayList<Frog> zooFrogs = new ArrayList<>();
		zooFrogs.add(tad);
		zooFrogs.add(pollie);
		zooFrogs.add(frank);
		
		Snake py = new Snake(true, false, "terrarium", "woodlands", true, false);
		Snake vold = new Snake(true, false, "terrarium", "woodlands", false, true);
		
		ArrayList<Snake> zooSnakes = new ArrayList<>();
		zooSnakes.add(py);
		zooSnakes.add(vold);
		
		Lizard liz = new Lizard(true, false, "terrarium", "jungle", true, true);
				
		Duck donald = new Duck(true, false, "cage", "ponds", true, true, true);
				
		Parrot polly = new Parrot(true, false, "cage", "jungle", false, true, "Polly want a cracker");
		Parrot paul = new Parrot(true, false, "cage", "jungle", false, true, "Shut up Polly");
		
		ArrayList<Parrot> zooParrots = new ArrayList<>();
		zooParrots.add(polly);
		zooParrots.add(paul);
		
		Penguin happyFeet = new Penguin(true, false, "aquarium", "Antarctica", true, false, true);
		
		//Let's begin printing!
		//Note that I utilized this method of printing when the typical way did not work. Technical details below (line: 150).
		
		//Intro
		System.out.println("An irresponsible mother came to the zoo as a " + zooHumans.get(1).getRole() + ". She did not watch her kid.");
		System.out.println("Little Timmy came to the zoo as a " + zooHumans.get(0).getRole() + ".  He really wanted to see the gorillas.");
		System.out.println("Oh no!  Little Timmy fell into the gorilla enclosure.  Someone save him!");
		System.out.println("Bob, the " + zooHumans.get(2).getRole() + ", cocked his weapon.  No zoo " + zooHumans.get(0).getRole() + "s die on his watch!");
		System.out.println("Harumbe was chilling in his cage, minding his own business.  He was a " + harumbe.getFurColor() + " " + harumbe.getBreed() + ".");
		System.out.println("Boom!  Harumbe goes down.  I should probably get out of here....");
		
		System.out.println();
		System.out.println("After all that hubbub, I walked around to see the other animals.");
		
		//Lions
		for (int i = 0; i < 3; i++) {
			System.out.println("I saw a lion who was " + zooLions.get(i).getFurColor() + 
					".  His natural habitat is the " + zooLions.get(i).getHabitat() + ".  His roar sounded like " +
					zooLions.get(i).getRoarSound() + ".");
		}
		
		//Platypus
		System.out.println("I saw a " + plato.getFurColor() + " platypus who lived in a " + plato.getEnclosureType() + ".");
		
		//Squirrels
		for (int i = 0; i < 2; i++) {
			String nomNomTrash = " was eating trash, running loose throuhgout the zoo.";
				if (!(zooSquirrels.get(i).isEatingTrash())) {
					nomNomTrash = " was not eating trash, running loose throuhgout the zoo.";
				}
			System.out.println("I saw a " + zooSquirrels.get(i).getFurColor() + " squirrel who" + nomNomTrash);
		}
		
		//Frogs
		for (int i = 0; i < 3; i++) {
			System.out.println("I saw a frog that was a " + zooFrogs.get(i).getLifeCycleStage() + ".");
		}
		
		//Snakes
		for (int i = 0; i < 2; i++) {
			String slitherin = " speaks parseltongue.  Creepy!";
				if (!(zooSnakes.get(i).isSpeaksParselTongue())) {
					slitherin = " does not speak parseltongue.  Snakes can't talk, right?";
				}
			String sunBathe = " currently basking in the sun";
				if (!(zooSnakes.get(i).isCurrentlyBaskingInSun())) {
					sunBathe = " not currently basking in the sun";
				}
			System.out.println("I saw a snake who was" + sunBathe + " and" + slitherin);
		}
		System.out.println("(Technically, I realize that in Harry Potter, it's the person, not the snake, that must know parseltongue...)");
		
		//Lizard
		String lizardColor = " was green.";
			if (!(liz.isGreen)) {
				lizardColor = " was not green.";
			}
		System.out.println("I saw a lizard that" + lizardColor);
		
		//Duck
		String quack = " was quacking loudly.";
			if (!(donald.isQuacking)) {
				quack = " was oddly quiet.";
			}
		System.out.println("I saw a duck who" + quack);
		
		//Parrots
		for (int i = 0; i < 2; i++) {
			System.out.println("I saw a parrot who loudly cawed \"" + zooParrots.get(i).getSays() + ".\"");
		}
		
		//Penguin
		System.out.println("Finally, I saw a penguin who resided from " + happyFeet.getHabitat() + " and was living in an " + 
		happyFeet.getEnclosureType() + ".");
		
		System.out.println("What an eventfulful day.  RIP Harumbe 2016.");
	}
	
}


// My program was unable to use getters to access parameters of sub classes that were multiple levels deep
// due to poor self teaching of abstraction in an effort to complete epic mode.
// I labeled parent classes abstract thus breaking their getters (whoops!).
// Example: I could not call '.getRole' for Humans (Animals > Mammals > Humans) when accessing an ArrayList of Animal objects.
// I changed my sysout lines to this style as compared to the examples shown during lecture as a work around.
// If it makes you feel any better, I totally understand abstraction now, I'm just not going to go back and
// fix my code at this time :-)
// - John Suchocki 8/10/16
