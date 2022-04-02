package de.feu.validation;

import java.util.Scanner;

public class ValidatingCalculator {

	public void start() {
		int zahl = 0;
		int zahl2 = 0;

		Scanner sc = new Scanner(System.in);

		zahl = retrieveZahl(sc);
		zahl2 = retrieveZahl(sc);

		int ergebnis = zahl + zahl2;
		System.out.println("Ergebnis: " + ergebnis);

		sc.close();
	}

	private int retrieveZahl(Scanner sc) {
		int zahl2;
		System.out.println("Gib bitte eine Zahl ein...");

		if (sc.hasNextInt()) {
			zahl2 = sc.nextInt();
		} else {
			System.out.println("Eine Zahl Mensch!");
			sc.next(); // verkonsumieren
			zahl2 = sc.nextInt();
		}
		return zahl2;
	}

}
