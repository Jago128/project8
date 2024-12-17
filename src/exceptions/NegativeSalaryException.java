package exceptions;

public class NegativeSalaryException extends Exception {
	private static final long serialVersionUID = 6601267785520225615L;
	
	public void NegativeSalaryExceptionMessage(double salario) {
		System.out.println("La cuenta queda en negativos, operacion invalida.");
	}
}
