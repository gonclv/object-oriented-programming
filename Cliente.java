package ex4;

public abstract class Cliente {
    private String nome;
    private String dataNascimento;
    private int telefone;
    private Endereco endereco;
    
    public abstract void imprimirDadosCliente();
    
    public String getNome() {
        return nome;
    }
}