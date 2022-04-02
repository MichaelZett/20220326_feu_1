package de.feu.logistik.fracht;

import java.util.UUID;

public class Frachtschiff {
	private static final int MAXIMALE_TANK_GROESSE = 5000;
	private String name;
	private UUID id;
	private int tank;

	public Frachtschiff(String name) {
		this.name = name;
		this.tank = MAXIMALE_TANK_GROESSE;
		this.id = UUID.randomUUID();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void volltanken() {
		this.tank = MAXIMALE_TANK_GROESSE;
	}

	public void verbraucheTreibstoff(int menge) {
		this.tank = this.tank - menge;
	}

	public UUID getId() {
		return id;
	}

	public int getTank() {
		return tank;
	}

	@Override
	public String toString() {
		return "Frachtschiff [name=" + name + ", id=" + id + ", tank=" + tank + "]";
	}

}
