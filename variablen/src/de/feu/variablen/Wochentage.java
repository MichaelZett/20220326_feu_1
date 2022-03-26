package de.feu.variablen;

import java.util.Scanner;

public class Wochentage {

	public static void main(String[] args) {
		char tag = 'a';
		Scanner sc = new Scanner(System.in);
		System.out.println("Gib Wochentag als Buchstabe ein (m,d,i,o,f)...");
		if (sc.hasNext()) {
			tag = sc.next().charAt(0);
			// Primitive, Enum, String, RegEx
			switch (tag) {
			case 'm': {
				System.out.println("Noch 5 Tage bis zum Wochenende!");
				break;
			}
			case 'd': {
				System.out.println("Noch 4 Tage bis zum Wochenende!");
				break;
			}
			case 'i': {
				System.out.println("Noch 3 Tage bis zum Wochenende!");
				break;
			}
			case 'o': {
				System.out.println("Noch 2 Tage bis zum Wochenende!");
				break;
			}
			case 'f': {
				System.out.println("Noch 1 Tag bis zum Wochenende!");
				break;
			}
			default:
				System.out.println("Nicht mein Kalender!");
			}
		}
		sc.close();
	}

}
