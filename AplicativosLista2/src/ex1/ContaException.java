package ex1;

public class ContaException extends Exception {

	public ContaException() {
		super("Conta não encontrada.");
	}
}
