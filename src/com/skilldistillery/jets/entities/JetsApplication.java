package com.skilldistillery.jets.entities;

import java.util.Scanner;

public class JetsApplication {
	private AirField airField;

	private void launch(){
		Scanner kB = new Scanner(System.in);
		menu(kB);
	}

	/*
	 * Ashley said this jetsApplication must be here, but I don't think it
	 * communicates with the entities package which is why I get the null error
	 * since I can't point to anything. I fixed it by removing it from a separate 
	 * jets.app package that created itself when she said to add an application, and like 
	 * in the food truck app, I made sure all classes were in the same package. 
	 * 
	 * Also to note, just like the last project it says my README can't save. 
	 */

	public JetsApplication jetApp = new JetsApplication();

	public static void main(String[] args) {
	private jetApp.launch(){
		//not sure why this doesn't provide any drop down for the dot operator. 
	}
	
	private void menu(Scanner kB) {
		boolean menuSelect = true;
		while (menuSelect) {

			String jetModel = null;
			double jetSpeed = 0;
			int jetRange = 0;
			long jetPrice = 0;

			// Jet jetPlane = new Jet (jetModel, jetSpeed, jetRange, jetPrice);

			System.out.println("-------------------Welcome To----------------------");
			System.out.println("---------------- J E T T I S O N ------------------");
			System.out.println("------------ All Aboard, Or Overboard! ------------");
			System.out.println("---Select An Option: ------------------------------");
			System.out.println("-1.List Fleet--------------------------------------");
			System.out.println("-2.Fly All Jets------------------------------------");
			System.out.println("-3.View Fastest Jet--------------------------------");
			System.out.println("-4.View Jet With Longest Range---------------------");
			System.out.println("-5.Load All Cargo Jets-----------------------------");
			System.out.println("-6.DOGFIGHT!---------------------------------------");
			System.out.println("-7.Add A Jet To Fleet------------------------------");
			System.out.println("-8.Remove A Jet From Fleet-------------------------");
			System.out.println("-9.Quit--------------------------------------------");
			int menuItem = kB.nextInt();
			kB.nextLine();
		

			switch (menuItem) {
			case 1:

				for (int i = 0; i < airField.getAirField().size(); i++) {

					if (airField.getAirField() != null) {
						System.out.println(airField.getAirField().get(i));

					}
				}

				break;

			case 2:
				System.out.println("Flying All Jets");
	//			fly();

			case 3:

			case 4:
				menuSelect = false;
				System.out.println(" Gotta Blast! Now Quitting Program. ");

				break;
			default:
//			System.out.println("Invalid Entry.");

			}

		}
	}
}

