package de.feu.variablen;

import java.util.Scanner;

public class InAndOutputScanner {

	public static void main(String[] args) {
		String name = "NoName";

		Scanner sc = new Scanner(System.in);
		name = sc.next();

		String greeting = "Hello, " + name;

		System.out.println(greeting);
		sc.close();
	}

}
