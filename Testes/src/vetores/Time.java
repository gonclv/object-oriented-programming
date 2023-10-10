package vetores;

import java.util.Arrays;

public class Time {

	private String nome;
	private String cidade;
	private Pessoa[] jogadores;
	
	public Time(String nome, String cidade, Pessoa[] jogadores) {
		this.nome = nome;
		this.cidade = cidade;
		this.jogadores = jogadores;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Cidade: " + cidade + ", Jogadores: " + Arrays.toString(jogadores);
	}
	
	
}
