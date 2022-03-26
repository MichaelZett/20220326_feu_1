package de.feu.variablen;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForEachSchleife {

	public static void main(String[] args) {
		LinkedList<String> liste = new LinkedList<>();
		liste.add("Arne");
		liste.add("Tessa");
		// teuer der direkte Zugriff
		System.out.println(liste.get(1));

		ArrayList<String> liste2 = new ArrayList<>();
		liste.add("Arne");
		liste.add("Tessa");
		System.out.println(liste2.get(1));

		// Java 5
		for (String item : liste) {
			System.out.println(item);
		}

		// Java 8 - method reference
		liste.forEach(System.out::println);
		// Java 8 - lambda
		liste.forEach(i -> System.out.println(i));

	}

}
