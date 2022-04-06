package objectsworkshop;

/**
 * Esta clase hace referencia a el tipo de cuenta y hereda un atributo de la clase BankAccount
 * @author Daniela Montano
 *
 */

public class TypeAccount extends BankAccount {
	
	private String savings;
	private String common;
	
	public String getSavings() {
		return savings;
	}
	public void setSavings(String savings) {
		this.savings = savings;
	}
	public String getCommon() {
		return common;
	}
	public void setCommon(String common) {
		this.common = common;
	}

}
