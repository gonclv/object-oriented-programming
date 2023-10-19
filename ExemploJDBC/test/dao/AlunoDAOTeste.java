package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import entities.Aluno;
import entities.Curso;

public class AlunoDAOTeste {

	public static void cadastrarAlunoTeste() throws SQLException, IOException {
		Aluno aluno = new Aluno();
		Date data = new Date(1000000000);
		Curso curso = new Curso();
		
		aluno.setRegistroAcademico(25000001);
		aluno.setNome("Laura G");
		aluno.setSexo("Feminino");
		aluno.setCurso(curso);
		aluno.setDataIngresso(data);
		aluno.setPeriodo(2);
		aluno.setCoeficiente(0.6);
		
		Connection conn = BancoDados.conectar();
		new AlunoDAO(conn).cadastrar(aluno);
		
		System.out.println("Cadastro efetuado com sucesso!");
	}
	
	public static void buscarTodosTeste() throws SQLException, IOException {
		Connection conn = BancoDados.conectar();
		List<Aluno> listaAlunos = new AlunoDAO(conn).buscarTodos();
		
		for(Aluno aluno : listaAlunos) {
			System.out.println(aluno.getRegistroAcademico() + " - " + aluno.getNome() + " - " + aluno.getSexo() + " - " + aluno.getCurso() + " - " + aluno.getDataIngresso() + " - " + aluno.getPeriodo() + " - " + aluno.getCoeficiente());
		}
	}
	
	public static void buscarPorRATeste() throws SQLException, IOException {
		Connection conn = BancoDados.conectar();
		Aluno aluno = new AlunoDAO(conn).buscarPorRA(25000000);
		
		if(aluno != null) {
			System.out.println(aluno.getRegistroAcademico() + " - " + aluno.getNome() + " - " + aluno.getSexo() + " - " + aluno.getCurso() + " - " + aluno.getDataIngresso() + " - " + aluno.getPeriodo() + " - " + aluno.getCoeficiente());
		}
		else {
			System.out.println("Erro - Código não encontrado.");
		}
	}
	
	public static void atualizarTeste() throws SQLException, IOException {
		Aluno aluno = new Aluno();
		aluno.setRegistroAcademico(2444444);
		aluno.setPeriodo(5);
		aluno.setCoeficiente(0.79);
		
		Connection conn = BancoDados.conectar();
		new AlunoDAO(conn).atualizar(aluno);
		
		System.out.println("Dados do aluno atualizados com sucesso.");
	}
	
	public static void excluirTeste() throws SQLException, IOException {
		Connection conn = BancoDados.conectar();
		int linhasManipuladas = new AlunoDAO(conn).excluir(25000000);
		
		if(linhasManipuladas > 0) {
			System.out.println("Aluno excluído com sucesso.");
		}
		else {
			System.out.println("Nenhum registro foi encontrado.");
		}
	}
	
	public static void main(String[] args) {
		try {
			AlunoDAOTeste.cadastrarAlunoTeste();
			AlunoDAOTeste.buscarTodosTeste();
			AlunoDAOTeste.buscarPorRATeste();
			AlunoDAOTeste.atualizarTeste();
			AlunoDAOTeste.excluirTeste();
		}
		catch (SQLException | IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
