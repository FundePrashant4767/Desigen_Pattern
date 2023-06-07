package com.jspiders.factory.main;

import java.util.Scanner;

import com.jspiders.factory.car.Endeavour;
import com.jspiders.factory.car.Harrier;
import com.jspiders.factory.car.HondaCity;
import com.jspiders.factory.car.Nexon;
import com.jspiders.factory.car.Xuv700;

public class CarFactory {
	private static com.jspiders.factory.inter.car car;

	public static void main(String[] args) {

		try {

			factory().buyCar();

		} catch (NullPointerException e) {
			System.out.println("No Car Selected ");
		}

	}

	private static com.jspiders.factory.inter.car factory() {
		System.out.println(" Car Purches Option \n" + "1. Harrier \n" + "2. XUV 700 \n" + "3. Honda City \n"
				+ "4. Endevour \n" + "5.Nexon");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			car = new Harrier();
			break;

		case 2:
			car = new Xuv700();
			break;

		case 3:
			car = new HondaCity();
			break;

		case 4:
			car = new Endeavour();
			break;

		case 5:
			car = new Nexon();
			break;

		default:
			System.out.println("Invallid Choice....!!");
			break;
		}

		return car;
	}

}
