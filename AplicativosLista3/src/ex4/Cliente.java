package ex4;

public abstract class Cliente {
    protected String nome;
    protected String dataNascimento;
    protected int telefone;
    protected Endereco endereco;
    
    public Cliente(String nome, String dataNascimento, int telefone, Endereco endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public abstract void imprimirDadosCliente();

	public String getNome() {
		return nome;
	}
}