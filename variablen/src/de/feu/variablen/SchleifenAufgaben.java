package de.feu.variablen;

public class SchleifenAufgaben {

	public static void main(String[] args) {
//		for (int i = 0; i < 30; i++) {
//			System.out.print("*");
//		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}

}
