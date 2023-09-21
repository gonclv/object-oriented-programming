package calcularArea;

public class Losango extends Quadrilatero {

	private double diagonalMenor;
	private double diagonalMaior;
	
	public Losango(double diagonalMenor, double diagonalMaior, String cor) {
		super(cor);
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	}
	
	public void calcularArea() {
		System.out.println("Área do losango: " + (diagonalMaior * diagonalMenor)/2); 
	}
	
	public void calcularPerimetro() {
		//System.out.println("Perímetro do losango: " + (4 * Math.sqrt(diagonalMaior * diagonalMaior + diagonalMenor * diagonalMenor)));
		System.out.println("Perímetro do losango: " + (2 * diagonalMaior + 2 * diagonalMenor));
	}

	@Override
	public String toString() {
		return "Losango [diagonalMenor=" + diagonalMenor + ", diagonalMaior=" + diagonalMaior + ", cor=" + cor + "]";
	}
}
