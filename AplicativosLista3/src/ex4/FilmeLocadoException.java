package ex4;

public class FilmeLocadoException extends Exception {

	public FilmeLocadoException() {
		super("Erro: O filme já foi locado");
	}
}
