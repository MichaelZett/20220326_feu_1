package de.feu.logistik;

import de.feu.logistik.fracht.Frachtschiff;
import de.feu.logistik.report.Reporter;
import de.feu.logistik.wartung.Tankstelle;

public class LogistikApp {

	public static void main(String[] args) {
		Frachtschiff petra = new Frachtschiff("Petra", 100);

		Reporter reporter = new Reporter();
		reporter.erstelleReport(petra);

		petra.verbraucheTreibstoff(100);

		Tankstelle tankstelle = new Tankstelle();
		tankstelle.tanke(petra);

	}

}
