package aula06.exercicio2;

public class Gato extends Mamifero {

	public Gato(String nome, String raca) {
		super(nome, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(nome + " está miando");
	}
}
