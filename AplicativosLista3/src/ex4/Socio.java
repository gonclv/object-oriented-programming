package ex4;

public class Socio extends Cliente {
    private int cpf;
    
    public Socio(String nome, String dataNascimento, int telefone, Endereco endereco, int cpf) {
    	super(nome, dataNascimento, telefone, endereco);
    	this.cpf = cpf;
    }
    
    public void imprimirDadosCliente() {
    	System.out.println(nome + dataNascimento + telefone + endereco + cpf);
    }
}