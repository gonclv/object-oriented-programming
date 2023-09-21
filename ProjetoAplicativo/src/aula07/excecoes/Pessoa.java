package aula07.excecoes;

public class Pessoa {

	private String nome;
	private int idade;
	private int cpf;
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private int cep;
	
	public Pessoa(String nome, int idade, int cpf, String logradouro, int numero, String bairro, String cidade,
			String estado, int cep) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public void setCpf(int cpf) {
		this.cpf = cpf;
	}



	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public void setCep(int cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", logradouro=" + logradouro + ", numero="
				+ numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + "]";
	}
}
