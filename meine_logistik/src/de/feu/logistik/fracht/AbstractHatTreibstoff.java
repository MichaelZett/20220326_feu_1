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

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [treibstoff=" + treibstoff + ", tank=" + tank + "]";
	}

	public void reparieren() {
		System.out.println("Schäden werden beseitigt.");
		weitereTaetigkeiten();
	}

	protected abstract void weitereTaetigkeiten();

}
