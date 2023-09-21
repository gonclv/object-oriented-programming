package calcularArea;

public class Quadrado extends Quadrilatero {

	private double lado;
	
	public Quadrado(double lado, String cor) {
		super(cor);
		this.lado = lado;
	}
	
	public void calcularArea() {
		System.out.println("�rea do quadrado: " + lado * lado);
	}
	
	public void calcularPerimetro() {
		System.out.println("Per�metro do quadrado: " + 4 * lado);
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", cor=" + cor + "]";
	}
}
