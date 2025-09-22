package com.java.interviewquestions;

public class Test {
	public static void main(String[] args) {

		String str = "Hello World";
		char[] ch = str.toCharArray();
		int length = str.length();
		int count = 0;

		System.out.println("Given String :: " + str);
		System.out.print("Repeated characters :: ");
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[j] + " ");
					count++;
					break;
				}
			}
		}
		System.out.println();
		System.out.println("Repeated characters count :: " + count);
	}
}
