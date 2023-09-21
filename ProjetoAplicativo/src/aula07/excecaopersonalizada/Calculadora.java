package aula07.excecaopersonalizada;

public class Calculadora {

	public void calcularRaizQuadrada(double valor) throws NumeroNaoNaturalException {
		if(valor < 0) {
			throw new NumeroNaoNaturalException();
		}
		
		System.out.println(Math.sqrt(valor));
	}
}
