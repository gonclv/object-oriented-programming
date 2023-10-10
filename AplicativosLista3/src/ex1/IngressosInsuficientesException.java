package ex1;

public class IngressosInsuficientesException extends Exception {

	public IngressosInsuficientesException() {
		super("Exceção - não estão disponíveis ingressos suficientes para esta sessão.");
	}
}
