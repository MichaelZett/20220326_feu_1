package de.feu.calculator;

import de.feu.validation.ValidatingCalculator;

public class CalculatorApp {

	public static void main(String[] args) throws InterruptedException {

		ValidatingCalculator valCalc = new ValidatingCalculator();
		valCalc.start();

	}

}
