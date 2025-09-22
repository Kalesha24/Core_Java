/*Lloyds Technology Centre Company*/

package com.java.interviewquestions;

public class AnagramByCount {
	// Normalize: remove non-letters and lowercase
	private static String normalize(String s) {
		return s.replaceAll("[^A-Za-z]", "").toLowerCase();
	}

	public static boolean areAnagrams(String s1, String s2) {
		s1 = normalize(s1);
		s2 = normalize(s2);

		if (s1.length() != s2.length())
			return false;

		int[] counts = new int[26]; // a-z

		// For each index, increment for s1 char and decrement for s2 char
		for (int i = 0; i < s1.length(); i++) {
			counts[s1.charAt(i) - 'a']++;
			counts[s2.charAt(i) - 'a']--;
		}

		// If all zero -> anagram
		for (int c : counts) {
			if (c != 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(areAnagrams("listen", "silent")); // true
		System.out.println(areAnagrams("eat", "tea")); // true
		System.out.println(areAnagrams("Dormitory", "Dirty room")); // true
		System.out.println(areAnagrams("hello", "world")); // false
	}
}
