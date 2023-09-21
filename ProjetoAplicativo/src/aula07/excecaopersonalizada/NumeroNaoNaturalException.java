package aula07.excecaopersonalizada;

public class NumeroNaoNaturalException extends Exception {

	public NumeroNaoNaturalException() {
		super("Foi informado um número não natural.");
	}
}
