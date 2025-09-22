package com.corejava;

public class Duplicate_test {
	public static void main(String[] args) {
		String s = "Basha";
		char str[] = s.toCharArray();
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (str[i] == str[j]) {

					System.out.print(str[i]);
				}
			}
		}

	}

}
