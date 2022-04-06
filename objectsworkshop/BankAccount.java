package objectsworkshop;
/**
 * Esta clase nos muestra el numero de cuenta y por medio de un metodo se definiria si esta activa o no.
 * @author Daniela Montano Gomez
 *
 */

public class BankAccount {
	
	private int accountNumber;
	protected boolean activated;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
	

}
