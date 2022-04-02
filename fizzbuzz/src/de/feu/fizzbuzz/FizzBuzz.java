package de.feu.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

	public static void main(String[] args) {
		// Stream - Komma geht einfach
		String result = IntStream.rangeClosed(1, 100).mapToObj(FizzBuzz::determineWord)
				.collect(Collectors.joining(","));
		System.out.println(result);

		// vielleicht besser lesbar
		for (int i = 1; i <= 100; i++) {
			result = result + determineWord(i);
			if (i < 100) {
				result = result + ",";
			}
		}
		System.out.print(result);
	}

	private static String determineWord(int zahl) {
		if (zahl % 3 == 0 && zahl % 5 == 0) {
			return "FizzBuzz";
		} else if (zahl % 3 == 0) {
			return "Fizz";
		} else if (zahl % 5 == 0) {
			return "Buzz";
		} else {
			return "" + zahl; // String.valueOf(zahl);
		}
	}

	private static String determineWordOneReturn(int zahl) {
		String result = "";
		if (zahl % 3 == 0 && zahl % 5 == 0) {
			result = "FizzBuzz";
		} else if (zahl % 3 == 0) {
			result = "Fizz";
		} else if (zahl % 5 == 0) {
			result = "Buzz";
		} else {
			result = "" + zahl; // String.valueOf(zahl);
		}
		return result;
	}

}
