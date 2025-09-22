package com.java.interviewquestions;

import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedCharacters {
	public static void main(String[] args) {
		String input = "JAVAEEJAVA";
		System.out.println("Given String :: " + input);
		System.out.println("Repeated Characters are :: ");
		Map<Character, Long> result = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		result.forEach((k, v) -> {
			if (v > 1) {
				System.out.println(k + " = " + v);
			}
		});
	}
}
