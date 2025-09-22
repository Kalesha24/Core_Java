package com.corejava.programs;

public class DuplicateCharactersCount {

	public static void main(String[] args) {

		String str = "kalesha shaik";
		int count = 0;
		char[] ch = str.toCharArray();

		System.out.println("Duplicate characters are : ");
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j]);
					count++;
				}
			}
		}
		System.out.println("DUPLICATE CHARACTERS COUNT IS :: " + count);
	}
}
