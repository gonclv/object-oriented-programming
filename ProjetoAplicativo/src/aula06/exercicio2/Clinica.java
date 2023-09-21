package aula06.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

	private String cnpj;
	private String razaoSocial;
	private List<Mamifero> mamiferos;
	
	public Clinica(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.mamiferos = new ArrayList<Mamifero>();
	}
	
	public void cadastrar(String nome, String raca) {
		Mamifero novo = new Mamifero(nome, raca);
		mamiferos.add(novo);
	}
	
	public void listarAnimais() {
		for(Mamifero mamifero : mamiferos) {
			System.out.println("Nome: " + mamifero.nome);
			System.out.println("Raça: " + mamifero.raca);		}
	}

	@Override
	public String toString() {
		return "Clinica [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", mamiferos=" + mamiferos + "]";
	}
}
