package designprogramming;

/**
 * La clase naves no tripuldas, hace referencia a una de las tres naves que se
 * estan presentando en el ejercicio. Tiene como atributo la velocidad y a su
 * vez va a heredar de la clase Spaceships.
 * 
 * @author Daniela Montano
 *
 */
public class UnmannedShip extends Spaceships {

	protected float speed;

	public UnmannedShip(float thrust, float weight, boolean manned, float speed, int status) {
		super(thrust, weight, manned, status);
		this.speed = speed;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	// Comportamientos abstractos de la nave
	@Override
	public void takeoff() {
		System.out.println("The UnmannedShip has takenoff");
	}

	@Override
	public void landed() {
		System.out.println("The UnmannedShip has landed");

	}

	@Override
	public void flying() {
		System.out.println("The mannedships is flying ");

	}

}
