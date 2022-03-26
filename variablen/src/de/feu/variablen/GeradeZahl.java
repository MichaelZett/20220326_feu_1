package de.feu.variablen;

import java.util.Scanner;

public class GeradeZahl {

	public static void main(String[] args) {
		int zahl = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Gib zahl ein...");
		if (sc.hasNextInt()) {
			zahl = sc.nextInt();
			if (zahl % 2 == 0) {
				System.out.println("Gerade!");
			} else {
				System.out.println("Ungerade!");
			}
		}

		sc.close();
	}

}
