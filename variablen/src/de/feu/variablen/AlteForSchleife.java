package de.feu.variablen;

public class AlteForSchleife {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("Parameter " + i + " ist " + args[i]);
		}

		String[] meinArray = new String[5];
		meinArray[0] = "Gerd";
		System.out.println("Array-Wert nicht befüllt: " + meinArray[1]);
		String[] meinInitialBefuelltesAray = { "Peter", "Ute", "efihrufh", "jfekfj" };

		for (int i = 0; i < 10; i++) {
			System.out.println("runde: " + i);
		}
	}

}
