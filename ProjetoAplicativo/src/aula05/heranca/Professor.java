package aula05.heranca;

public class Professor extends Pessoa {
	private double salario;
	
	public Professor(String nome, int idade, Endereco endereco, double salario) {
		super(nome, idade, endereco);
		this.salario = salario;
		
	}
	
	public void calcularSalario() {
		System.out.println("Salário do professor " + this.nome + ": R$" + String.format("%.2f", this.salario));
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Salário: " + this.salario);
		System.out.println("Logradouro: " + this.endereco.getLogradouro());
		System.out.println("Número: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("UF: " + this.endereco.getUnidadeFederativa());
	}
}
