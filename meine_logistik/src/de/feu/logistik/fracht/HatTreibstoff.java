package de.feu.logistik.fracht;

public interface HatTreibstoff {
	int getTank();

	Treibstoff getTreibstoff();

	void volltanken();

	void verbraucheTreibstoff(int menge);
}
