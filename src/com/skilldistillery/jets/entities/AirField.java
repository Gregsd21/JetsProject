package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	private List<Jet> airField;

	public List<Jet> getAirField() {
		return airField;
	}

	public void setAirField(List<Jet> airField) {
		this.airField = airField;
	}

	public void jetRead() {
		List<Jet> airField = new ArrayList<Jet>();
		try (BufferedReader br = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] jetRecord = line.split(", ");
				String jetType = jetRecord[0];
				String jetModel = jetRecord[1];
				double jetSpeed = Double.parseDouble(jetRecord[2]);
				int jetRange = Integer.parseInt(jetRecord[3]);
				long jetPrice = Long.parseLong(jetRecord[4]);

				// if(jetRecord[0].equals("Luxury")) {

			}
			System.out.println("Read the line: " + line);

			br.close();
		} catch (FileNotFoundException e) {
			System.err.println(e);
			
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
		}

//br.close(); was here...but was out of scope..

	}
}
