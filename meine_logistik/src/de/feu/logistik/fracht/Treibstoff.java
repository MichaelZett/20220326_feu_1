package de.feu.logistik.fracht;

public enum Treibstoff {
	DIESEL("Diesel"), WASSERSTOFF("Treibstoff"), SOLAR("Solar");

	private String uiName;

	private Treibstoff(String uiName) {
		this.uiName = uiName;
	}

	public String getUiName() {
		return uiName;
	}

}
