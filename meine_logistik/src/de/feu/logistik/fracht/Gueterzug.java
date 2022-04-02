package de.feu.logistik.fracht;

public class Gueterzug extends AbstractHatTreibstoff {

	public Gueterzug() {
		super();
		this.treibstoff = Treibstoff.SOLAR;
	}

	@Override
	protected void weitereTaetigkeiten() {
	}
}
