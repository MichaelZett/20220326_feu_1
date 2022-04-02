package de.feu.euler;

public class Problem2 {

	public static void main(String[] args) {
		int result = 2;
		int lastLastResult = 1;
		int lastResult = 2;
		int currentResult = 3;

		while (currentResult <= 4_000_000) {
			if (isEven(currentResult)) {
				result = result + currentResult;
			}
			lastLastResult = lastResult;
			lastResult = currentResult;
			currentResult = lastResult + lastLastResult;
		}
		System.out.println("Result: " + result);
	}

	private static boolean isEven(int zahl) {
		return zahl % 2 == 0;
	}
}
