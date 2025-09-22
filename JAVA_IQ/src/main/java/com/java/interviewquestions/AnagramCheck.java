/*Lloyds Technology Centre Company*/

package com.java.interviewquestions;

import java.util.Arrays;

public class AnagramCheck {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		// Convert to char arrays
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		// Sort both arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Compare
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}
}
