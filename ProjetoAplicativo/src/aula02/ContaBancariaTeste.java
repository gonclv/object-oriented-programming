package aula02;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(111, "João da Silva");
		
		conta1.imprimirSaldo();
		conta1.depositar(100.00);
		conta1.imprimirSaldo();
		conta1.sacar(110.00);
		conta1.imprimirSaldo();
		
		conta1.setNomeTitular("Ana da Silva"); //trans
		
		System.out.println(conta1.getNumeroConta());
		System.out.println(conta1.getNomeTitular());
		System.out.println(String.format("%.2f", conta1.getSaldo()));
	}
}
