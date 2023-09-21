package ex1;

public class Pessoa {

	private String nome;
	private String nascimento;
	private long rg;
	private long cpf;
	
	public Pessoa(String nome, String nascimento, long rg, long cpf) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public void imprimirPessoa() {
		System.out.println("Nome: " + nome);
		System.out.println("Nascimento: " + nascimento);
		System.out.println("RG: " + rg);
		System.out.println("CPF: " + cpf);
	}
}
