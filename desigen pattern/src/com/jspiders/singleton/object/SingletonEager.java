package com.jspiders.singleton.object;

public class SingletonEager {

	private static SingletonEager object = new SingletonEager();
	private static int count;

	public SingletonEager() {

		count++;
		System.out.println("Object Created " + count + " Times ");

	}

	public static SingletonEager getObject() {
		System.out.println("Trying to Create Object ");
		return object;
	}

}
