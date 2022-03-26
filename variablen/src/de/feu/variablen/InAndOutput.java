package de.feu.variablen;

public class InAndOutput {

	/**
	 * Braucht ein Programmargument z.B. über die RunConfiguration
	 */
	public static void main(String[] args) {
		String name = args[0];

		String greeting = "Hello, " + name;

		System.out.println(greeting);

	}

}
