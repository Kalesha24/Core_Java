package com.core;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String str = "Kalesha shaik";
		int count = 0;
		char[] ch = str.toCharArray();

		System.out.println("Actual String is :: " + str);
		System.out.print("Duplicate characters are :: " );

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[j] + " ");
				}
			}
		}
	}
}
