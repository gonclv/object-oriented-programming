package ex4;

public class Dependente extends Cliente {
    public Dependente(String nome, String dataNascimento, int telefone, Endereco endereco) {
		super(nome, dataNascimento, telefone, endereco);
	}

	public void imprimirDadosCliente() {
        System.out.println(nome + dataNascimento + telefone + endereco);
    }
}