package com.corejava;

public class Test1 {

	public static void main(String[] args) {
		String s="Hello";
		char[] ch = s.toCharArray();
		System.out.println("Reverse string is :: ");
		for (int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
//		System.out.println(s.length);
		System.out.println(s.length());
	}

}
