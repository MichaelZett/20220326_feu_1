package de.feu.logistik.wartung;

import de.feu.logistik.fracht.AbstractHatTreibstoff;

public class Werkstatt {
	private Tankstelle tanke = new Tankstelle();

	public void generalUeberholen(AbstractHatTreibstoff... ding) {
		for (int i = 0; i < ding.length; i++) {
			ding[i].reparieren();
			tanke.tanke(ding[i]);
		}
	}

}
