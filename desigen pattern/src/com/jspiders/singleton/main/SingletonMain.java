package com.jspiders.singleton.main;

import com.jspiders.singleton.object.SingletonEager;
import com.jspiders.singleton.object.SingletonLeazy;

public class SingletonMain {

	public static void main(String[] args) {
		
		SingletonLeazy Leazy1 = new SingletonLeazy();
	
		System.out.println(Leazy1);
		SingletonEager eager1 = new SingletonEager();
		System.out.println(eager1);
	}
	
}
