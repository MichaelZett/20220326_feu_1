package de.feu.variablen;

import java.util.Scanner;

public class Calculator {

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
		int ergebnis = Integer.parseInt(zahl) + Integer.parseInt(zahl2);
		System.out.println("habe Ergebnis: " + ergebnis);

		sc.close();
	}

}
