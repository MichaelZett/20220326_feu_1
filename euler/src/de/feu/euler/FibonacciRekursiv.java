package de.feu.euler;

import java.util.HashMap;

public class FibonacciRekursiv {
	private static final HashMap<Long, Long> SPEICHER = new HashMap<>();

	public static void main(String[] args) {
		System.out.println("Result: " + fibonacci(8L));
	}

	private static Long fibonacci(Long zahl) {
		if (zahl == 1L || zahl == 2L) {
			return 1L;
		}
		if (SPEICHER.containsKey(zahl)) {
			return SPEICHER.get(zahl);
		}

		Long result = fibonacci(zahl - 1) + fibonacci(zahl - 2);
		SPEICHER.put(zahl, result);
		return result;
	}
}
