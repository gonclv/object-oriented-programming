package ex1;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Conta> contas;
	private int indiceAtual;
	
	public Banco() {
		this.contas = new ArrayList<Conta>();
		indiceAtual = 1;
	}
	
	public void adicionarNovaConta(String nome, long cpf) {
		Conta conta = new Conta(indiceAtual, nome, cpf);
		this.contas.add(conta);
		System.out.println("Conta " + indiceAtual + " adicionada com sucesso.");
		indiceAtual++;
	}
	
	public void imprimirContas() {
		for(Conta conta : contas) {
			conta.imprimirDadosConta();
		}
	}
	
	public void removerConta(int numeroConta) {
		try {
			for(int i = 0; i < contas.size(); i++) {
				if(contas.get(i).getNumeroConta() == numeroConta) {
					contas.remove(i);
					System.out.println("Conta " + numeroConta + " removida com sucesso.");
					return;
				}
			}
			
			throw new ContaException();
		}
		catch (ContaException ce) {
			System.out.println(ce.getMessage());
		}
	}
	
	public void verificarSaldo(int numeroConta) {
		try {
			for(Conta conta : contas) {
				if(conta.getNumeroConta() == numeroConta) {
					conta.imprimirSaldo();
					return;
				}
			}
			
			throw new ContaException();
		}
		catch (ContaException ce) {
			System.out.println(ce.getMessage());
		}
	}

	public void realizarSaque(int numeroConta, double valor) {
		try {
			for(Conta conta : contas) {
				if(conta.getNumeroConta() == numeroConta) {
					conta.sacar(valor);
					return;
				}
			}
			
			throw new ContaException();
		}
		catch (ContaException | SaldoException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void realizarDeposito(int numeroConta, double valor) {
		try {
			for(Conta conta : contas) {
				if(conta.getNumeroConta() == numeroConta) {
					conta.depositar(valor);
					return;
				}
			}
			
			throw new ContaException();
		}
		catch (ContaException ce) {
			System.out.println(ce.getMessage());
		}
	}
}
