package com.corejava;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {

		String s1 = "Scaler";
		System.out.println(s1);

		String s2 = new String("Interviewbit");
		System.out.println(s2);

		Scanner input = new Scanner(System.in);
		String s3 = input.nextLine();
		System.out.println(s3);

		input.close();
	}
}
