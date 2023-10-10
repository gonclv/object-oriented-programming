package ex1;

public class Sessao {

	private String data;
	private String horario;
	private int numIngressos;
	private Sala sala;
	private Filme filme;
	
	public Sessao(String data, String horario, Sala sala, Filme filme) {
		this.data = data;
		this.horario = horario;
		this.numIngressos = sala.getCapacidadeMax();
		this.sala = sala;
		this.filme = filme;
	}
	
	public Sessao(String data, String horario, int numIdentificacao, int capacidadeMax, String titulo, int duracao) {
		this.data = data;
		this.horario = horario;
		this.numIngressos = capacidadeMax;
		this.sala = new Sala(numIdentificacao, capacidadeMax);
		this.filme = new Filme(titulo, duracao);
	}
	
	public void venderIngressos(int numIngressosVenda) {
		try {
			if(numIngressosVenda <= numIngressos) {
				numIngressos -= numIngressosVenda;
				System.out.println("Venda de " + numIngressosVenda + " ingressos realizada com sucesso!");
			}
			else {
				throw new IngressosInsuficientesException();
			}
		}
		catch (IngressosInsuficientesException iie) {
			System.out.println(iie.getMessage());
		}
	}
	
	public int calcularIngressosVendidos() {
		return sala.getCapacidadeMax() - numIngressos;
	}
	
	public void imprimirDados() {
		System.out.println("Data da sessão: " + data);
		System.out.println("Horário da sessão: " + horario);
		System.out.println("Total de ingressos vendidos: " + this.calcularIngressosVendidos());
		System.out.println("Número da sala: " + sala.getNumIdentificacao());
		System.out.println("Nome do filme: " + filme.getTitulo());
		System.out.println("Duração do filme: " + filme.getDuracao() + " minutos");
	}
}
