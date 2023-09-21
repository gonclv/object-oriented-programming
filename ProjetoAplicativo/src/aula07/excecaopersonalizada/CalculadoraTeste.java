package aula07.excecaopersonalizada;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		try {
			calc.calcularRaizQuadrada(-81);
		}
		catch (NumeroNaoNaturalException nnne) {
			System.out.println(nnne.getMessage());
		}
	}
}
