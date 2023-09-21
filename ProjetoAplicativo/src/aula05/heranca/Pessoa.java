package aula05.heranca;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected Endereco endereco;
	
	public Pessoa(String nome, int idade, Endereco endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	public Pessoa(String nome, int idade, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = new Endereco(logradouro, numero, bairro, cidade, unidadeFederativa);
	}
}
