package de.feu.variablen;

public class Datatypes {

	public static void main(String[] args) {
		// Ganzzahlen
		short kleineZahl = 1;
		int ganzzahl = 4;
		int negativeZahl = -42;
		long grosseGanzzahl = 2_500_000_000L;
//		int ichKannAuchGrosseZahlen = 2_500_000_000; geht nicht

		ganzzahl = (int) grosseGanzzahl; // Geht, aber falsch
		grosseGanzzahl = negativeZahl; // int Teilmenge von Long

		System.out.println("Nach Cast: " + ganzzahl);

		System.out.println("Short max: " + Short.MAX_VALUE);
		System.out.println("Integer max: " + Integer.MAX_VALUE);
		System.out.println("Long max: " + Long.MAX_VALUE);

		Long grosseGanzzahlObject = grosseGanzzahl;
		long zahl = 0;
		Long zahlWrapper = null;
		System.out.println("Zahl: " + zahl + " groﬂ Long: " + zahlWrapper);

		// Dezimalzahlen
		float fliesspunktZahl = 3.5F;
		double grosseFliesspunktZahl = 2.500_000_000_000_000;
		System.out.println("Float max: " + Float.MAX_VALUE);
		System.out.println("Double max: " + Double.MAX_VALUE);

		// Logik
		boolean logik = true;

		// Buchstaben
		char buchstabe = 'c';

		String zahlAlsText = String.valueOf(negativeZahl);
		System.out.println("Text : " + zahlAlsText);

		int neueZahl = Integer.parseInt(zahlAlsText);
		System.out.println("Wieder Zahl : " + zahlAlsText);
	}

}
