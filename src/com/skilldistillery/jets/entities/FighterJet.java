package com.skilldistillery.jets.entities;

public class FighterJet  extends Jet implements CombatReady{
	

	public FighterJet(String jetModel, double jetSpeed, int jetRange, long jetPrice) {
		super(jetModel, jetSpeed, jetRange, jetPrice);
		
	}

	public void fight() {
		System.out.println("Bang, Bang, Bye, Bye!");
	}
}
