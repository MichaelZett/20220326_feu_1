package de.feu.variablen;

public class Operators {

	public static void main(String[] args) {
		// Rechnen
		int addieren = 4 + 7;
		int subtrahieren = 11 - 7;
		double dividieren = 20 / 8;
		long multiplizieren = 200 * 200;
		int modulo = 20 % 7;

		double pow = Math.pow(2.0, 5.0);
		double sqrt = Math.sqrt(36.0);
		double abs = Math.abs(-sqrt);

		// Logik
		boolean kleiner = 7 < 5;
		boolean groesser = 7 > 5;
		boolean gleich = 7 == 5;
		boolean ungleich = kleiner != groesser;

		boolean und = kleiner && gleich;
		boolean oder = groesser || gleich;
		boolean xor = kleiner ^ groesser;
		boolean nichtUnd = !(kleiner && gleich);

		// String
		String peter = "peter";
		String peter2 = "peter";

		boolean result = peter == peter2; // nicht machen!
		System.out.println(result);
		result = peter.equals(peter2);
		System.out.println(result);

		// Object
		Object frauke = new Object();
		Object frank = new Object();

		result = frauke == frank;
		System.out.println(result);

	}

}
