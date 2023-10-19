package ex1;

public class SaldoException extends Exception {

	public SaldoException() {
		super("Saldo disponível na conta é insuficiente.");
	}
}
