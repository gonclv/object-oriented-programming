package aula06.exercicio2;

public class Cavalo extends Mamifero {

	public Cavalo(String nome, String raca) {
		super(nome, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(nome + " está relinchando");
	}
}
