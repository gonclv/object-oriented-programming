package ex1;

public class Sala {

	private int numIdentificacao;
	private int capacidadeMax;
	
	public Sala(int numIdentificacao, int capacidadeMax) {
		this.numIdentificacao = numIdentificacao;
		this.capacidadeMax = capacidadeMax;
	}
	
	public int getCapacidadeMax() {
		return capacidadeMax;
	}

	public int getNumIdentificacao() {
		return numIdentificacao;
	}
}
