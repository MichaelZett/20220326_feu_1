package de.feu.variablen;

import java.util.Iterator;
import java.util.LinkedList;

public class WhileSchleife {

	public static void main(String[] args) {
//		int i = 0;
//		while (i < 10) {
//			System.out.println("Runde: " + i);
//			i++;
//		}

		LinkedList<String> liste = new LinkedList<>();
		liste.add("Arne");
		liste.add("Tessa");
		Iterator<String> iterator = liste.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		int i = 0;
		// Repeat Until
		do {
			System.out.println("Hallo von do");
		} while (i > 0);

		while (i > 0) {
			System.out.println("Hallo von while");
		}

	}

}
