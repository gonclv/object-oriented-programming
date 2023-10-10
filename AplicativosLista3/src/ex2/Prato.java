package ex2;

public class Prato {

	private int numero;
	private String nomePrato;
	private TipoPrato tipo;
	private String ingredientes;
	private double precoUnitario;
	
	public Prato(int numero, String nomePrato, TipoPrato tipo, String ingredientes, double precoUnitario) {
		super();
		this.numero = numero;
		this.nomePrato = nomePrato;
		this.tipo = tipo;
		this.ingredientes = ingredientes;
		this.precoUnitario = precoUnitario;
	}
	
	public int getNumero() {
		return numero;
	}
	public String getNomePrato() {
		return nomePrato;
	}
	public TipoPrato getTipo() {
		return tipo;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
}
