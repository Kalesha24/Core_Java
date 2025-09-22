package com.java.interviewquestions;

import java.util.*;

public class Non_RepeatedCharacters {

	public static void main(String[] args) {

		String str = "JAVA";
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		System.out.println("Non-Repeated characters :: ");

		for (char ch : str.toCharArray()) {
			if (map.get(ch) == 1) {
				System.out.print(ch + " ");
			}
		}
	}
}
