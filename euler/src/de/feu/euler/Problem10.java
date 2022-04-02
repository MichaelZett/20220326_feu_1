package de.feu.euler;

import java.util.stream.LongStream;

public class Problem10 {

	public static void main(String[] args) {
		// streams
		long result = LongStream.rangeClosed(2, 2_000_000).filter(Problem10::isPrime).peek(System.out::println).sum();
		System.out.println(result);
	}

	private static boolean isPrime(Long zahl) {
		if (zahl == 2) {
			return true;
		}
		if (zahl % 2 == 0) {
			return false;
		}
		for (int i = 3; i < Math.sqrt(zahl) + 1; i = i + 2) {
			if (zahl % i == 0) {
				return false;
			}
		}
		return true;
	}
}
