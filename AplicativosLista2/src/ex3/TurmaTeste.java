package ex3;

public class TurmaTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Pedro", 111);
		aluno1.cadastrarNotasAluno(10, 0, 5, 5);
		
		Aluno aluno2 = new Aluno("Tiago", 222);
		aluno2.cadastrarNotasAluno(5, 0, 0, 5);
		
		Aluno aluno3 = new Aluno("João", 333);
		aluno3.cadastrarNotasAluno(1, 2, 3, 4);
		
		Aluno aluno4 = new Aluno("Maria", 444);
		aluno4.cadastrarNotasAluno(10, 10, 9, 10);
		
		Aluno aluno5 = new Aluno("Vinicius", 555);
		aluno5.cadastrarNotasAluno(7, 8, 4, 5);
		
		
		Turma turmaPOO = new Turma("Prog. Orientada a Objetos");
		turmaPOO.cadastrarAlunos(aluno1, aluno2, aluno3, aluno4, aluno5);
		
		turmaPOO.calcularMediaTurma();
		
		for(Aluno aluno : turmaPOO.getAlunos()) {
			aluno.verificarSituacaoAluno();
		}
	}
}
