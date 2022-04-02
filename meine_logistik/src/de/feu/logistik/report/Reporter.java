package de.feu.logistik.report;

import java.util.Arrays;

public class Reporter {

	public void erstelleReport(Object... printable) {
		System.out.println("Mein Report:");
		Arrays.asList(printable).forEach(System.out::println);
	}

}
