package aula04.contabancaria;

public class ContaBancaria {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0;
	}
	
	public void sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso!");
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso!");
	}
	
	public void imprimirSaldo() {
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.println("Nome do titular: " + this.nomeTitular);
		System.out.println("Saldo: R$" + String.format("%.2f", this.saldo));
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public String getNomeTitular() {
		return this.nomeTitular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
