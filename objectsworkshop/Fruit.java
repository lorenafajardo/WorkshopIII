package objectsworkshop;

import java.util.ArrayList;

/**
 * La clase KindFruit tiene definidos tres atributos, uno de ellos es un arreglo para definir los colores
 * a su vez hereda de la clase KindFruit que define a que clase de frutas pertenece.
 * @author Daniela Montano
 *
 */
public class Fruit extends KindFruit {
	
	public String name;
	private float averageWeight;
	public ArrayList<String> colors;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAverageWeight() {
		return averageWeight;
	}
	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}
	public ArrayList<String> getColors() {
		return colors;
	}
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	
	

}
