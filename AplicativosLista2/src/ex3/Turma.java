package ex3;

import java.util.Arrays;

public class Turma {

	private String nomeTurma;
	private Aluno[] alunos;
	
	public Turma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
		this.alunos = null;
	}
	
	public void cadastrarAlunos(Aluno aluno1, Aluno aluno2, Aluno aluno3, Aluno aluno4, Aluno aluno5) {
		Aluno[] alunos = {aluno1, aluno2, aluno3, aluno4, aluno5};
		this.alunos = alunos;
	}
	
	public void calcularMediaTurma() {
		double soma = 0;
		for(int i = 0; i < getAlunos().length; i++) {
			soma += getAlunos()[i].calcularMediaAluno();
		}
		
		System.out.println("Turma " + nomeTurma);
		System.out.println("Média da turma: " + (soma / getAlunos().length));
	}
	
	public Aluno[] getAlunos() {
		return alunos;
	}
	
	@Override
	public String toString() {
		return "Turma [nome=" + nomeTurma + ", alunos=" + Arrays.toString(getAlunos()) + "]";
	}
}
