package objectsworkshop;
/**
 * Esta clase esta compuesta por un atributo llamado branches y hereda atributos de la clase Person.
 * @author Daniela Montano
 *
 */
public class Bank extends Person {
	
	private String branches;

	public String getBranches() {
		return branches;
	}

	public void setBranches(String branches) {
		this.branches = branches;
	}

}
