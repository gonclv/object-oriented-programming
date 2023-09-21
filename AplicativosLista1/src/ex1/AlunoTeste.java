package ex1;

public class AlunoTeste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Danilo", "29/01/2001", 111222333, 3456789);
		pessoa.imprimirPessoa();
		System.out.println("===============================");
		
		Aluno aluno1 = new Aluno(245, pessoa);
		aluno1.imprimirAluno();
		System.out.println("===============================");
		
		Aluno aluno2 = new Aluno(345, "Laura", "05/11/2000", 345678, 876543);
		aluno2.imprimirAluno();
		System.out.println("===============================");
	}
}
