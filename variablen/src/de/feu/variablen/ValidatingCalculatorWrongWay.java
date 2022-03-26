package de.feu.variablen;

import java.util.Scanner;

public class ValidatingCalculatorWrongWay {

	public static void main(String[] args) throws InterruptedException {
		String zahl = "NoName";
		String zahl2 = "NoName";

		Scanner sc = new Scanner(System.in);
		System.out.println("Gib zahl ein...");
		zahl = sc.next();
		System.out.println("Gib noch zahl ein...");
		zahl2 = sc.next();

		System.out.println("Ich rechne...");
		Thread.sleep(100L);
		int zahlAlsZahl = Integer.parseInt(zahl);
		int zahl2AlsZahl = 0;
		try {
			zahl2AlsZahl = Integer.parseInt(zahl2);
		} catch (NumberFormatException e) {
			System.out.println("Das war keine Zahl, versuch' noch mal...");
			zahl2 = sc.next();
			zahl2AlsZahl = Integer.parseInt(zahl2);
		}
		int ergebnis = zahlAlsZahl + zahl2AlsZahl;
		System.out.println("habe Ergebnis: " + ergebnis);

		sc.close();
	}

}
