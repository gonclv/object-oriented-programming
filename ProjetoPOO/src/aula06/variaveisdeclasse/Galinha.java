package aula06.variaveisdeclasse;

public class Galinha {

	String nome;
	int quantOvos;
	static int quantOvosGranja;
	
	public Galinha(String nome) {
		this.nome = nome;
	}
	
	public void botar() {
		this.quantOvos++;
		quantOvosGranja++;
	}
}
