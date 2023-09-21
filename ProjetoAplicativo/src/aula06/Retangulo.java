package calcularArea;

public class Retangulo extends Quadrilatero {

	private double base;
	private double altura;
	
	public Retangulo(double base, double altura, String cor) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}
	
	public void calcularArea() {
		System.out.println("�rea do ret�ngulo: " + base * altura);
	}
	
	public void calcularPerimetro() {
		System.out.println("Per�metro do ret�ngulo: " + (2 * base + 2 * altura));
	}

	@Override
	public String toString() {
		return "Retangulo [base=" + base + ", altura=" + altura + ", cor=" + cor + "]";
	}
}
