/*Lloyds Technology Centre Company*/

package com.java.interviewquestions;

import java.util.Arrays;

public class AnagramBySort {
	// Normalize: remove non-letters and lowercase
	private static String normalize(String s) {
		return s.replaceAll("[^A-Za-z]", "").toLowerCase();
	}

	public static boolean areAnagrams(String a, String b) {
		a = normalize(a);
		b = normalize(b);

		if (a.length() != b.length())
			return false;

		char[] ca = a.toCharArray();
		char[] cb = b.toCharArray();
		Arrays.sort(ca);
		Arrays.sort(cb);

		return Arrays.equals(ca, cb);
	}

	public static void main(String[] args) {
		System.out.println(areAnagrams("listen", "silent")); // true
		System.out.println(areAnagrams("eat", "tea")); // true
		System.out.println(areAnagrams("Dormitory", "Dirty room")); // true (ignores space/case)
		System.out.println(areAnagrams("hello", "world")); // false
	}
}
