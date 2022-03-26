package de.feu.logistik;

public class LogistikApp {

	public static void main(String[] args) {
		Frachtschiff petra = new Frachtschiff("Petra");

		System.out.println(petra);

		petra = new Frachtschiff("Günther");

		System.out.println(petra);
		System.out.println("");
	}

}
