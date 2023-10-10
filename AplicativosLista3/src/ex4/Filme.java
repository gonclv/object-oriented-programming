package ex4;

public class Filme {
    private String titulo;
    private int duracao;
    private double preco;
    private int diaLocacao;
    private int diaPrevistoDevolucao;
    private int diaDevolucao;
    private Cliente clienteLocacao;
    private double valorLocacao;
    private double valorMulta;
    
    public Filme(String titulo, int duracao, double preco) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.preco = preco;
        this.diaLocacao = 0;
        this.diaPrevistoDevolucao = 0;
        this.diaDevolucao = 0;
        this.clienteLocacao = null;
        this.valorLocacao = 0;
        this.valorMulta = 0;
    }
    
    public void realizarLocacao(Cliente cliente, int dia) {
        if(clienteLocacao != null) {
            System.out.println("Erro filme ja alocado");
        }
        else {
            diaLocacao = dia;
            clienteLocacao = cliente;
            valorLocacao = preco;
            diaPrevistoDevolucao = dia + 3;
        }
    }
    
    public void realizarDevolucao(int dia) {
        if(clienteLocacao == null) {
            System.out.println("Erro filme nao esta alocado");
        }
        else {
            diaDevolucao = dia;
            valorMulta = calcularValorMulta();
            valorLocacao = valorLocacao + valorMulta;
        }
    }
    
    private double calcularValorMulta() {
        if((clienteLocacao != null) && (diaDevolucao > diaPrevistoDevolucao)) {
            return 2 * (diaDevolucao - diaPrevistoDevolucao);
        }
        return 0;
    }
    
    public void imprimirRelatorio() {
        System.out.println("Título do filme: " + titulo);
        if(clienteLocacao == null) {
            System.out.println("Filme locado: Não");
        }
        else {
            System.out.println("Filme locado: Sim");
            System.out.println("Nome do cliente que fez a locação: " + clienteLocacao.getNome());
            System.out.println("Dia da locação: " + diaLocacao);
            System.out.println("Dia previsto da devolução: " + diaPrevistoDevolucao);
            System.out.println("Dia da devolução: " + diaDevolucao);
            System.out.println("Preço do filme: " + preco);
            System.out.println("Valor da multa: " + valorMulta);
            System.out.println("Valor total da locação :" + valorLocacao);
        }
    }
    
}