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
		int count = 0;
		int zahl = Integer.MIN_VALUE;
		while (zahl == Integer.MIN_VALUE) {
			System.out.println("Gib bitte eine Zahl ein...");
			if (sc.hasNextInt()) {
				zahl = sc.nextInt();
			} else {
				callForNumer(count);
				sc.next(); // verkonsumieren
				count++;
			}
		}
		return zahl;
	}

	private void callForNumer(int count) {
		if (count < 3) {
			System.out.println("Entschuldigung, das war leider keine Zahl. Bitte versuche es nochmal!");
		} else if (count < 7) {
			System.out.println("Immer noch keine Zahl. Zahlen sind z.B.: 1,2,3...");
		} else {
			System.out.println("Eine ZAHL, Mensch!!!!");
		}
	}

}
