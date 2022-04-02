package de.feu.logistik;

import static de.feu.logistik.fracht.Treibstoff.DIESEL;

import java.util.Arrays;

import de.feu.logistik.fracht.Frachtschiff;
import de.feu.logistik.fracht.Treibstoff;
import de.feu.logistik.report.Reporter;
import de.feu.logistik.wartung.Tankstelle;

public class LogistikApp {

	public static void main(String[] args) {
		Frachtschiff petra = new Frachtschiff("Petra", DIESEL);

		Reporter reporter = new Reporter();
		reporter.erstelleReport(petra);

		petra.verbraucheTreibstoff(100);

		Tankstelle tankstelle = new Tankstelle();
		tankstelle.tanke(petra);
		System.out.println("Unsere Treibstoffe: ");
		Arrays.asList(Treibstoff.values()).forEach(System.out::println);
		Treibstoff treibstoff = Treibstoff.valueOf("DIESEL");
		System.out.println(treibstoff.getUiName());
	}

}
