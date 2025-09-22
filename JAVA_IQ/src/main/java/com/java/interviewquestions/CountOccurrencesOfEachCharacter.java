package com.java.interviewquestions;

import java.util.*;

public class CountOccurrencesOfEachCharacter {

	public static void main(String[] args) {
		String inputString = "Hello World!";
		// Create a HashMap to store the character frequencies.
		Map<Character, Integer> characterCountMap = new HashMap<>();
		// Iterate through each character in the inputString.
		for (char character : inputString.toCharArray()) {
			// Check if the character already exists in the characterCountMap.
			if (characterCountMap.containsKey(character)) {
				// If the character already exists, increment its count.
				characterCountMap.put(character, characterCountMap.get(character) + 1);
			} else {
				// If the character does not exist, add it to the characterCountMap with a count
				// of 1.
				characterCountMap.put(character, 1);
			}
		}
		// Print the character frequencies.
		for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}