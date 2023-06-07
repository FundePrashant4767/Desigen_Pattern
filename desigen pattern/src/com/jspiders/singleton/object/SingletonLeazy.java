package com.jspiders.singleton.object;

public class SingletonLeazy {
	private static SingletonLeazy object;
	private static int count;

	public SingletonLeazy() {
		count++;
		System.out.println("Object Created" + count + " Times");
	}

	public static SingletonLeazy getObject() {
		if (object == null) {
			object = new SingletonLeazy();
		}
		return object;
	}
}
