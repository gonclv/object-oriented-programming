package aula06.variaveisimutaveis;

public class Pessoa {
	
	final int cpf;
	String nome;
	String dataNascimento;
	int telefone;
	String email;
	String estadoCivil;
	
	public Pessoa(int cpf, String nome, String dataNascimento, int telefone, String email, String estadoCivil) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", telefone=" + telefone
				+ ", email=" + email + ", estadoCivil=" + estadoCivil + "]";
	}
}
