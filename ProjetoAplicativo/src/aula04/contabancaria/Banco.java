package aula04.contabancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nomeBanco;
	private List<ContaBancaria> contas;
	
	public Banco(int cnpj, String nomeBanco) {
		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contas = new ArrayList<ContaBancaria>();
	}
	
	public void criarNovaConta(int numeroConta, String nomeTitular) {
		ContaBancaria nova = new ContaBancaria(numeroConta, nomeTitular);
		
		this.contas.add(nova);
		System.out.println("Conta cadastrada com sucesso!");
	}
	
	public void removerConta(int numeroConta) {
		ContaBancaria antiga = contas.get(1);
		
		contas.remove(antiga); //ou passa o índice 1
	}
	
	public void imprimirConta(int numeroConta) {
		for(ContaBancaria conta : contas) {
			if(conta.getNumeroConta() == numeroConta) {
				conta.imprimirSaldo();
				return;
			}
		}
		
		System.out.println("Erro: conta inexistente");
	}
	
	public void realizarDeposito(int numeroConta, double valor) {
		for(ContaBancaria conta : contas) {
			if(conta.getNumeroConta() == numeroConta) {
				conta.depositar(valor);
				return;
			}
		}
		
		System.out.println("Erro: conta inexistente");
	}
	
	public void realizarSaque(int numeroConta, double valor) {
		for (ContaBancaria conta : contas) {
			if(conta.getNumeroConta() == numeroConta) {
				conta.sacar(valor);
				return;
			}
		}
		
		System.out.println("Erro: conta inexistente");
	}
}
