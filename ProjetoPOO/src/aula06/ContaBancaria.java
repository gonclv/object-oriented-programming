package aula06;

public class ContaBancaria {

	int numConta;
	int agencia;
	String nomeTitular;
	double saldo;
	static int numContaAtual;
	
	public ContaBancaria(int agencia, String nomeTitular) {
		numContaAtual++;
		this.numConta = numContaAtual;
		this.agencia = agencia;
		this.nomeTitular = nomeTitular;
		this.saldo = 0;
	}
	
	public void imprimirDados() {
		System.out.println("Número da conta: " + this.numConta);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Nome do titular: " + this.nomeTitular);
		System.out.println("Saldo: R$" + String.format("%.2f", this.saldo));
	}
}
