package com.skilldistillery.jets.entities;


public abstract class Jet {

	String jetModel;
	double jetSpeed;
	int jetRange;
	long jetPrice;
	//all the above are the fields that act like variables that are declared only.

	public Jet(String jetModel, double jetSpeed, int jetRange, long jetPrice) {
		super();
		this.jetModel = jetModel;
		this.jetSpeed = jetSpeed;
		this.jetRange = jetRange;

	}

	public void fly() { 
		System.out.println("Time in flight at " + jetSpeed + " will be " + jetRange / jetSpeed + "hours" );

	}

	public String getJetModel() {
		return jetModel;
	}

	public void setJetModel(String jetModel) {
		this.jetModel = jetModel;
	}

	public double getJetSpeed() {
		return jetSpeed;
	}

	public void setJetSpeed(double jetSpeed) {
		this.jetSpeed = jetSpeed;
	}

	public int getJetRange() {
		return jetRange;
	}

	public void setJetRange(int jetRange) {
		this.jetRange = jetRange;
	}

	public long getJetPrice() {
		return jetPrice;
	}

	public void setJetPrice(long jetPrice) {
		this.jetPrice = jetPrice;
	}

}