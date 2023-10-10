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
	
	public void calcularValorConta() {
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
		System.out.println("Prato " + prato.getNomePrato() + " adicionado com sucesso à conta.");
	}
}
