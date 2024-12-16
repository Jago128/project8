package clases;

public class SalarioNegativoException extends Exception {
	public SalarioNegativoException(double salario) {
		super("La cuenta queda en negativos, operacion invalida.");
	}

}
