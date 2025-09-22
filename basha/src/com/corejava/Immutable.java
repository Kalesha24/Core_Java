package com.corejava;

public class Immutable {
public static void main(String[] args) {
	Student s = new Student("ABCD1369D");
	String str=s.getId();
	System.out.println(str);
}
}
