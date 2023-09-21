package aula05.heranca;

public class Aluno extends Pessoa {

	private String curso;
	
	public Aluno(String nome, int idade, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa, String curso) {
		super(nome, idade, logradouro, numero, bairro, cidade, unidadeFederativa);
		this.curso = curso;
	}
	
	public void realizarMatricula() {
		System.out.println("Aluno " + this.nome + " está matriculado no curso " + this.curso);
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Curso: " + this.curso);
		System.out.println("Logradouro: " + this.endereco.getLogradouro());
		System.out.println("Número: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("UF: " + this.endereco.getUnidadeFederativa());
	}
}
