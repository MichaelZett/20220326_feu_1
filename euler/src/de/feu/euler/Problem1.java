package de.feu.euler;

import java.util.stream.IntStream;

public class Problem1 {

	public static void main(String[] args) {
		// streams
		int result = IntStream.range(1, 1000).filter(Problem1::isMultipleOf3OrFive).sum();
		System.out.println(result);

		result = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result = result + i;
			}
		}
		System.out.println(result);
	}

	private static boolean isMultipleOf3OrFive(int zahl) {
		return zahl % 3 == 0 || zahl % 5 == 0;
	}
}
