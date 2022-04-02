package de.feu.validation;

import java.util.Scanner;

public class ValidatingCalculator {

	public void start() throws InterruptedException {
		int zahl = 0;
		int zahl2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Gib zahl ein...");
		if (sc.hasNextInt()) {
			zahl = sc.nextInt();
		}
		System.out.println("Gib noch zahl ein...");

		if (sc.hasNextInt()) {
			zahl2 = sc.nextInt();
		}
//	else if (sc.hasNextLong()) { weitere else if möglich
//		zahl2 = (int) sc.nextLong();
//	} 
		else {
			System.out.println("Eine Zahl Mensch!");
			sc.next(); // verkonsumieren
			zahl2 = sc.nextInt();
		}

		System.out.println("Ich rechne...");
		Thread.sleep(100L);
		int ergebnis = zahl + zahl2;
		System.out.println("habe Ergebnis: " + ergebnis);

		sc.close();

	}

}
