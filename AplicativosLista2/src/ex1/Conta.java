package ex1;

public class Conta {

	private int numeroConta;
	private double saldo;
	private Cliente cliente;
	
	public Conta(int numeroConta, String nome, long cpf) {
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
		this.cliente = new Cliente(nome, cpf);
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void imprimirDadosConta() {
		System.out.println("Número da conta: " + numeroConta);
		System.out.println("Saldo: R$" + String.format("%.2f", saldo));
		cliente.imprimirDadosCliente();
	}
	
	public void imprimirSaldo() {
		System.out.println("Saldo da conta " + numeroConta + ": R$" + String.format("%.2f", saldo));
	}
	
	public void sacar(double valor) throws SaldoException {
		if(valor > saldo) {
			throw new SaldoException();
		}
		else {
			saldo -= valor;
			System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado com sucesso na conta " + numeroConta);
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso na conta " + numeroConta);
	}
}
