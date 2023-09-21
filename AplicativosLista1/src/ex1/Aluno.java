package ex1;

public class Aluno {

	private int numeroMatricula;
	private Pessoa pessoa;
	
	public Aluno(int numeroMatricula, Pessoa pessoa) {
		this.numeroMatricula = numeroMatricula;
		this.pessoa = pessoa;
	}
	
	public Aluno(int numeroMatricula, String nome, String nascimento, long rg, long cpf) {
		this.numeroMatricula = numeroMatricula;
		this.pessoa = new Pessoa(nome, nascimento, rg, cpf);
	}
	
	public void imprimirAluno() {
		pessoa.imprimirPessoa();
		System.out.println("Número de matrícula: " + numeroMatricula);
	}
}
