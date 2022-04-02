package de.feu.logistik.fracht;

public class Lkw extends AbstractHatTreibstoff {
	private static final int MAXIMALE_TANK_GROESSE = 300;

	public Lkw() {
		super();
		this.tank = MAXIMALE_TANK_GROESSE;
		this.treibstoff = Treibstoff.DIESEL;
	}

	@Override
	public void volltanken() {
		this.tank = MAXIMALE_TANK_GROESSE;
	}

	@Override
	protected void weitereTaetigkeiten() {
		System.out.println("Reifen aufpumpen.");
	}
}
