package com.core;

import java.util.Scanner;

public class StringReverseWithoutPredefinedKeyword {

	public static void main(String[] args) {
		
		String str1;
		String str2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		str1=sc.nextLine();
		
		//Reverse String
		str2=" ";
		StringBuffer sb = new StringBuffer(str1);
		str2=" " + sb.reverse();
		System.out.println("Reverse of "+ str1+" is :: "+str2);
	}
}
