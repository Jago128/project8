package clases;

public class NegativeSalaryException extends Exception {
	private static final long serialVersionUID = 6601267785520225615L;
	public NegativeSalaryException(double salario) {
		super("La cuenta queda en negativos, operacion invalida.");
	}
}
