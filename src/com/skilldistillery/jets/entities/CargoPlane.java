package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane(String jetModel, double jetSpeed, int jetRange, long jetPrice) {
		super(jetModel, jetSpeed, jetRange, jetPrice);
	
	}
	public void loadCargo() {
		System.out.println("Bloated and Loaded!");
	}
	

}
