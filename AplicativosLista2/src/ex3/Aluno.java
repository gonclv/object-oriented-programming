package ex3;

public class Aluno {

	private String nomeAluno;
	private int RA;
	private double[] notas;
	
	public Aluno(String nomeAluno, int RA) {
		this.nomeAluno = nomeAluno;
		this.RA = RA;
		this.notas = null;
	}
	
	protected void cadastrarNotasAluno(double nota1, double nota2, double nota3, double nota4) {
		double[] notas = {nota1, nota2, nota3, nota4};
		this.notas = notas;
	}
	
	protected void verificarSituacaoAluno() {
		double media = calcularMediaAluno();
		System.out.println("Média do aluno " + nomeAluno + ": " + media);
		
		if(media >= 6) {
			System.out.println("Aluno aprovado!");
		}
		else {
			System.out.println("Aluno reprovado");
		}
	}
	
	protected double calcularMediaAluno() {
		double soma = 0;
		for(int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		
		return soma / notas.length;
	}
	
	
}
