package aula06;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(001, "Danilo");
		ContaBancaria conta2 = new ContaBancaria(100, "Laura");
		ContaBancaria conta3 = new ContaBancaria(110, "Regina");
		
		conta1.imprimirDados();
		conta2.imprimirDados();
		conta3.imprimirDados();
		
		System.out.println("Total de contas existentes no sistema: " + ContaBancaria.numContaAtual);
	}
}
