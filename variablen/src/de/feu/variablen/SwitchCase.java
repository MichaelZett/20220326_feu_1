package de.feu.variablen;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int zahl = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Gib zahl ein...");
		if (sc.hasNextInt()) {
			zahl = sc.nextInt();
			// Primitive, Enum, String, RegEx
			switch (zahl) {
			case 1, 3, 5, 7, 9: {
				System.out.println("Ungerade!");
				break;
			}
			case 2, 4, 6, 8: {
				System.out.println("Gerade!");
				break;
			}
			default:
				System.out.println("Weitere Zahlen mit der Bezahlversion!");
			}
		} else {
			System.out.println("Keine Zahl - selber doof");
		}

		sc.close();

	}

}
