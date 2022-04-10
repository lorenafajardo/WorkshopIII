package designprogramming;

/**
 * Esta clase es la clase padre, de aqui heredaran las otras clases y se
 * implementaran los metodos correpondientes. Se han denomidado 5 atrubutos que
 * son recurrentes en las otras clases como lo son el peso, el empuje, si es
 * tripulada o no y la fecha inicial y final de actividad.
 */

public abstract class Spaceships implements InterfaceShips { //Implementamos la interfaz InterfaceShips indicando la implementacion de los metodos.

	protected float thrust;
	protected float weight;
	protected boolean manned;
	protected int status;

	public Spaceships(float thrust, float weight, boolean manned, int status) {
		super();
		this.thrust = thrust;
		this.weight = weight;
		this.manned = manned;
		this.status = status;

	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public float getThrust() {
		return thrust;
	}

	public void setThrust(float thrust) {
		this.thrust = thrust;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean isManned() {
		return manned;
	}

	public void setManned(boolean manned) {
		this.manned = manned;
	}

	/**
	 * Se crean dos comportamientos abstractos de la nave.
	 */
	public abstract void takeoff();

	public abstract void landed();

	public abstract void flying();
}
