package de.feu.logistik;

import static de.feu.logistik.fracht.Treibstoff.DIESEL;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import de.feu.logistik.fracht.AbstractHatTreibstoff;
import de.feu.logistik.fracht.Frachtschiff;
import de.feu.logistik.fracht.Gueterzug;
import de.feu.logistik.fracht.Lkw;
import de.feu.logistik.fracht.Treibstoff;
import de.feu.logistik.report.Reporter;
import de.feu.logistik.wartung.Werkstatt;

public class LogistikApp {

	public static void main(String[] args) {
		Frachtschiff petra = new Frachtschiff("Petra", DIESEL);

		petra.verbraucheTreibstoff(100);

		System.out.println("Unsere Treibstoffe: ");
		Arrays.asList(Treibstoff.values()).forEach(System.out::println);
		Treibstoff treibstoff = Treibstoff.valueOf("DIESEL");
		System.out.println(treibstoff.getUiName());

		AbstractHatTreibstoff lkw = new Lkw();
		lkw.verbraucheTreibstoff(50);
		System.out.println(lkw);

		Reporter reporter = new Reporter();
		reporter.erstelleReport(petra, lkw, new Gueterzug());

		Werkstatt werkstatt = new Werkstatt();
		werkstatt.generalUeberholen(petra, lkw, new Gueterzug());

		Set<Frachtschiff> flotte = new HashSet<>();

		flotte.add(petra);
		flotte.add(petra);

		System.out.println("Flottengroesse: " + flotte.size());
	}

}
