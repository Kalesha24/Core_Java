package com.core;

public class Singleton {

	private Singleton() {
	}

	private static Singleton singleObject = null;

	public static Singleton getInstance() {
		if (singleObject == null) {
			singleObject = new Singleton();
		}
		return singleObject;
	}

	public static void main(String[] args) {
		Singleton object1 = singleObject.getInstance();
		System.out.println(object1);

		Singleton object2 = singleObject.getInstance();
		System.out.println(object2);

		Singleton object3 = singleObject.getInstance();
		System.out.println(object3);
	}
}
