package designprogramming;

/**
 * Esta clase pertenece a las naves tripuladas y tiene como atributo el numero
 * de pasajeros que pueden estar en ellas. Adicionalmente, hereda de una clase
 * abstracta llamada Spaceship.
 * 
 * @author Daniela Montano
 *
 */

public class MannedShip extends Spaceships {

	private int passengers;

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	// Se crea el construstor con los parametos de la clase padre y a su vez el
	// propio atributo.
	public MannedShip(float thrust, float weight, boolean manned, int passengers, int status) {
		super(thrust, weight, manned, status);
		this.passengers = passengers;

	}

	// Comportamientos abstractos de la nave
	@Override
	public void takeoff() {
		System.out.println("The mannedship has takenoff");

	}

	@Override
	public void landed() {
		System.out.println("The mannedship has landed");

	}

	@Override
	public void flying() {
		System.out.println("The mannedships is flying ");

	}

}
