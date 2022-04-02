package de.feu.logistik.fracht;

public interface HatTreibstoff {
	int getTank();

	Treibstoff getTreibstoff();

	default void volltanken() {

	}

	void verbraucheTreibstoff(int menge);
}
