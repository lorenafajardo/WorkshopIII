package designprogramming.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import designprogramming.ATV;
import designprogramming.MannedShip;
import designprogramming.ShuttleShip;
import designprogramming.Spaceships;
import designprogramming.UnmannedShip;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static List<Spaceships> ships = new ArrayList<>();

	public static void main(String[] args) {
		mainMenu();

	}

	static Spaceships CreatShip(int option1) {
		// Se crea dentro de este metodo un Menu de opciones para crear una nave de
		// cualquier tipo

		if (option1 == 1) {
			System.out.println("Enter thrust");
			float thrust = sc.nextFloat();
			System.out.println("Enter weight");
			float weight = sc.nextFloat();
			System.out.println("Enter transportCapacity");
			float transportCapacity = sc.nextFloat();
			System.out.println("Ingrese el estado de la nave");
			System.out.println("1. Takeoff, 2. Landed, 3.Flying");
			int status = sc.nextInt();
			System.out.println("*Se creo la nave correctamente*");
			ShuttleShip s = new ShuttleShip(thrust, weight, false, transportCapacity, status);
			SubCreateShip(s);
			return s;// Creamos el objeto s con los parametos que recibe.
		} else if (option1 == 2) {
			System.out.println("Enter thrust");
			float thrust = sc.nextFloat();
			System.out.println("Enter weight");
			float weight = sc.nextFloat();
			System.out.println("Enter passengers");
			int passengers = sc.nextInt();
			System.out.println("Ingrese el estado de la nave");
			System.out.println("1. Takeoff, 2. Landed, 3.Flying");
			int status = sc.nextInt();
			System.out.println("*Se creo la nave correctamente*");
			MannedShip m = new MannedShip(thrust, weight, true, passengers, status);
			SubCreateShip(m);
			return m;
		} else if (option1 == 3) {
			System.out.println("Enter thrust");
			float thrust = sc.nextFloat();
			System.out.println("Enter weight");
			float weight = sc.nextFloat();
			System.out.println("Enter speed");
			float speed = sc.nextFloat();
			System.out.println("Ingrese el estado de la nave");
			System.out.println("1. Takeoff, 2. Landed, 3.Flying");
			int status = sc.nextInt();
			System.out.println("*Se creo la nave correctamente*");
			UnmannedShip u = new UnmannedShip(thrust, weight, false, speed, status);
			SubCreateShip(u);
			return u;
		} else if (option1 == 4) {
			System.out.println("Enter thrust");
			float thrust = sc.nextFloat();
			System.out.println("Enter weight");
			float weight = sc.nextFloat();
			System.out.println("Enter speed");
			float speed = sc.nextFloat();
			System.out.println("Enter fuel");
			String fuel = sc.next();
			System.out.println("Ingrese el estado de la nave");
			System.out.println("1. Takeoff, 2. Landed, 3.Flying");
			int status = sc.nextInt();
			System.out.println("*Se creo la nave correctamente*");
			ATV a = new ATV(thrust, weight, true, speed, fuel, status);
			SubCreateShip(a);
			return a;

		} else if (option1 == 5) {
			mainMenu();
		}

		return null;
	}
// Se crea la funcion mainMenu para optimizar el programa, ya que este menu es necesario usarlo en otro menus.

	static void mainMenu() {

		int option = 0;
		System.out.println("Choose the option you want:");
		System.out.println("1.Create ship");
		System.out.println("2.Exit");

		while (option != 2) {
			option = sc.nextInt();
			switch (option) {

			case 1:
				System.out.println("What type of ship do you wish to create?");
				System.out.println("1.ShuttleShip");
				System.out.println("2.MannedShip");
				System.out.println("3.UnmannedShip");
				System.out.println("4.ShipATV");
				System.out.println("5.Volver al menu");
				int option1 = sc.nextInt();
				if (option1 == 5) {
					mainMenu();
				} else {
					CreatShip(option1);
				}
			case 2:
				System.out.println("Ha finalizado el progrma.");
				System.exit(0);
			default:
				break;
			}
		}
	}

	static void SubCreateShip(Spaceships ship) {
		System.out.println("----------------------LOADING------------------------------");
		System.out.println("1.Presione <<1>> si Deseas saber el estado de la nave.");
		System.out.println("2. Volver al menu");
		System.out.println("3. Exit");
		int option2 = sc.nextInt();

		switch (option2) {

		case 1:
			// System.out.println("Mostrar estado nave:");
			if (ship.getStatus() == 1) {
				ship.takeoff();
			} else if (ship.getStatus() == 2) {
				ship.landed();
			} else {
				ship.flying();
			}
			break;

		case 2:
			mainMenu();
			break;
		case 3:
			System.out.println("El programa ha finalizado.");
			System.exit(0);

			break;

		}
	}

}
