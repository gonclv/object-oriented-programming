package aula06.exercicio2;

public class Cachorro extends Mamifero {

	public Cachorro(String nome, String raca) {
		super(nome, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(nome + " está latindo");
	}
	
	public void brincar() {
		System.out.println(nome + " está brincando");
	}
}
