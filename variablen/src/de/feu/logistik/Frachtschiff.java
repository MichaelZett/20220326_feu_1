package de.feu.logistik;

import java.util.UUID;

public class Frachtschiff {
	private String name;
	private UUID id;

	public Frachtschiff(String name) {
		this.name = name;
		this.id = UUID.randomUUID();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Frachtschiff [name=" + name + ", id=" + id + "]";
	}

}
