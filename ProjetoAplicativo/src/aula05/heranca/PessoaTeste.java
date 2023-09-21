package aula05.heranca;

public class PessoaTeste {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Monteiro Lobato", 1000, "Jd. Carvalho", "Ponta Grossa", "PR");
		
		Professor prof1 = new Professor("Vinicius", 30, endereco1, 15000);
		Aluno aluno1 = new Aluno("Danilo", 18, "Rua Vicente Machado", 10, "Centro", "Ponta Grossa", "PR", "BCC");
		
		prof1.calcularSalario();
		aluno1.realizarMatricula();
		
		System.out.println("======================");
		aluno1.imprimirDados();
		System.out.println("======================");
		prof1.imprimirDados();
	}
}
