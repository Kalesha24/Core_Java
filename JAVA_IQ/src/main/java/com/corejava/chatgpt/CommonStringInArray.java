package com.corejava.chatgpt;

public class CommonStringInArray {
	public static void main(String[] args) {
		String[] str = { "aabchd", "aabchk", "aabkj", "aabcdh", "aabchl" };

		// Assuming first string as common string
		String commonString = str[0];

		// Iterate through the array and compare each string with the first string
		for (int i = 1; i < str.length; i++) {
			String currentString = str[i];
			int j = 0;

			// Compare each character of the strings
			while (j < commonString.length() && j < currentString.length()) {
				if (commonString.charAt(j) != currentString.charAt(j)) {
					break;
				}
				j++;
			}

			// If the current string is not common with the previous common string, update
			// the common string
			commonString = commonString.substring(0, j);

			// If no common characters are found, break the loop
			if (commonString.isEmpty()) {
				break;
			}
		}

		System.out.println("Common string :: " + commonString);
	}
}
/*
 * Output: Common string :: aab
 * 
 */
