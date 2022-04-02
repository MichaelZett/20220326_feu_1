package de.feu.logistik.fracht;

public abstract class AbstractHatTreibstoff implements HatTreibstoff {
	protected Treibstoff treibstoff;;
	protected int tank;

	@Override
	public int getTank() {
		return tank;
	}

	@Override
	public Treibstoff getTreibstoff() {
		return treibstoff;
	}

	@Override
	public void verbraucheTreibstoff(int menge) {
		this.tank = this.tank - menge;
	}

}
