package ex2;

public class Cliente {

	private String nome;
	private int cpf;
	private Conta conta;
	
	public Cliente(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta = new Conta();
	}
}
