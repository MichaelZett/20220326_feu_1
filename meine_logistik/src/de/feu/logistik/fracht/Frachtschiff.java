package de.feu.logistik.fracht;

import java.util.Objects;
import java.util.UUID;

public class Frachtschiff extends AbstractHatTreibstoff {
	private static final int MAXIMALE_TANK_GROESSE = 5000;
	private String name;
	private UUID id;

	public Frachtschiff() {
		// nur so
	}

	public Frachtschiff(String name, Treibstoff treibstoff) {
		this();
		this.name = name;
		this.treibstoff = treibstoff;
		this.tank = MAXIMALE_TANK_GROESSE;
		this.id = UUID.randomUUID();
	}

	public Frachtschiff(String name, int tank, Treibstoff treibstoff) {
		this(name, treibstoff);
		this.tank = tank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UUID getId() {
		return id;
	}

	@Override
	public void volltanken() {
		if (this.treibstoff == Treibstoff.SOLAR) {
			throw new UnsupportedOperationException();
		}
		this.tank = MAXIMALE_TANK_GROESSE;
	}

	@Override
	public String toString() {
		return "Frachtschiff [name=" + name + ", id=" + id + ", treibstoff=" + treibstoff + ", tank=" + tank + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Frachtschiff other = (Frachtschiff) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	protected void weitereTaetigkeiten() {
		System.out.println("Muscheln vom Rumpf kratzen.");
	}

}
