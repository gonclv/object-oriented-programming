package aula04.contabancaria;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		Banco banco = new Banco(98765, "New Bank");
		
		banco.criarNovaConta(111, "João Silva");
		banco.criarNovaConta(222, "Maria das Flores");
		banco.criarNovaConta(333, "José Ricardo");
		
		banco.realizarDeposito(111, 200);
		banco.realizarDeposito(222, 1000000);
		banco.realizarDeposito(333, 20);
		banco.realizarDeposito(444, 150);
		
		banco.realizarSaque(111, 100);
		banco.realizarSaque(222, 2000000);
		banco.realizarSaque(333, 0);
		banco.realizarSaque(444, 20);
		
		banco.imprimirConta(111);
		banco.imprimirConta(222);
		banco.imprimirConta(333);
		banco.imprimirConta(444);
	}
}
