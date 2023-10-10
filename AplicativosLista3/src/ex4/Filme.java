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
    
    public void realizarLocacao(Cliente cliente, int dia) throws FilmeLocadoException {
        if(clienteLocacao != null) {
        	throw new FilmeLocadoException();
        }
        else {
            diaLocacao = dia;
            clienteLocacao = cliente;
            valorLocacao = preco;
            diaPrevistoDevolucao = dia + 3;
        }
    }
    
    public void realizarDevolucao(int dia) throws FilmeNaoLocadoException {
        if(clienteLocacao == null) {
        	throw new FilmeNaoLocadoException();
        }
        else {
            diaDevolucao = dia;
            valorMulta = calcularValorMulta();
            valorLocacao = valorLocacao + valorMulta;
            imprimirRelatorio();
        }
    }
    
    private double calcularValorMulta() {
    	//Se o filme estiver locado e passou do dia de devolução previsto, calcular multa
        if((clienteLocacao != null) && (diaDevolucao > diaPrevistoDevolucao)) {
            return 2 * (diaDevolucao - diaPrevistoDevolucao);
        }
        return 0;
    }
    
    private void imprimirRelatorio() {
    	System.out.println("\nDADOS DO FILME:");
        System.out.println("Título do filme: " + titulo);
        System.out.println("Duração do filme: " + duracao);
        System.out.println("\nDADOS DA LOCAÇÃO:");
        System.out.println("Nome do cliente que fez a locação: " + clienteLocacao.getNome());
        System.out.println("Dia da locação: " + diaLocacao);
        System.out.println("Dia previsto da devolução: " + diaPrevistoDevolucao);
        System.out.println("Dia da devolução: " + diaDevolucao);
        System.out.println("\nVALORES:");
        System.out.println("Preço do filme: " + preco);
        System.out.println("Valor da multa: " + valorMulta);
        System.out.println("Valor total da locação: " + valorLocacao);
    }
}