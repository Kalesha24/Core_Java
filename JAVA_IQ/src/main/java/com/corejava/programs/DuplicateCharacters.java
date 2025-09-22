package com.corejava.programs;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String str = "Kalesha Shaik";
		int length = str.length();
		char[] ch = str.toCharArray();

		System.out.println("Duplicate characters in a given string: ");
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j]);
				}
			}
		}
	}
}
