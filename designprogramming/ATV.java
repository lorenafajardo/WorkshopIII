package designprogramming;

public class ATV extends UnmannedShip {

	private String fuel;

	public ATV(float thrust, float weight, boolean manned, float speed, String fuel, int status) {
		super(thrust, weight, manned, speed, status);
		this.fuel = fuel;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public void takeoff() {
		System.out.println("The ATV has takenoff");
	}

	@Override
	public void landed() {

		System.out.println("The ATV has landed");
	}

	@Override
	public void flying() {
		System.out.println("The mannedships is flying ");

	}
}