package calcularArea;

public class TesteQuadrilatero {

	public static void main(String[] args) {
		Quadrado quadrado1 = new Quadrado(15, "Vermelho");
		Retangulo retangulo1 = new Retangulo(20, 10, "Branco");
		Losango losango1 = new Losango(30, 15, "Azul");
		
		quadrado1.calcularArea();
		quadrado1.calcularPerimetro();
		
		retangulo1.calcularArea();
		retangulo1.calcularPerimetro();
		
		losango1.calcularArea();
		losango1.calcularPerimetro();
	}
}
