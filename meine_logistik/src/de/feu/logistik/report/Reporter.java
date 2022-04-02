package de.feu.logistik.report;

import de.feu.logistik.fracht.Frachtschiff;

public class Reporter {

	public void erstelleReport(Frachtschiff schiff) {
		System.out.println("Mein Report:");
		System.out.println(schiff);
	}

}
