package designprogramming;

public class ShuttleShip extends Spaceships {

	private float transportCapacity;

	public ShuttleShip(float thrust, float weight, boolean manned, float transportCapacity, int status) {
		super(thrust, weight, manned, status);
		this.transportCapacity = transportCapacity;
	}

	public float getTransportCapacity() {
		return transportCapacity;
	}

	public void setTransportCapacity(float transportCapacity) {
		this.transportCapacity = transportCapacity;
	}

	// Comportamientos abstractos de la nave
	@Override
	public void takeoff() {
		System.out.println("The SuttleShip has takenoff");

	}

	@Override
	public void landed() {
		System.out.println("The SuttleShip has landed");

	}

	@Override
	public void flying() {
		System.out.println("The mannedships is flying ");

	}

}
