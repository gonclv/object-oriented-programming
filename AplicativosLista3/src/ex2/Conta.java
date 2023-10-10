package ex2;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	private List<Prato> pratos;
	private double valorConta;
	
	public Conta() {
		this.pratos = new ArrayList<Prato>();
		this.valorConta = 0;
	}
	
	private void calcularValorConta() {
		double valorTotalPratos = 0;
		
		for(Prato prato : pratos) {
			valorTotalPratos += prato.getPrecoUnitario();
		}
		
		double taxaAtendimento = 0.1 * valorTotalPratos;
		valorConta = valorTotalPratos + taxaAtendimento;
	}
	
	public void adicionarPrato(Prato prato) {
		pratos.add(prato);
		//pratos.remove(prato);
		calcularValorConta();
		System.out.println("Prato " + prato.getNomePrato() + " adicionado com sucesso à conta.");
	}
	
	public void fecharConta() {
		System.out.println("Pratos consumidos pelo cliente:");
		
		for(Prato prato : pratos) {
			System.out.println("Nome do prato: " + prato.getNomePrato());
			System.out.println("Valor unitário: R$" + String.format("%.2f", prato.getPrecoUnitario()));
		}
		
		System.out.println("Valor total da conta: R$" + String.format("%.2f", valorConta));
	}
}
