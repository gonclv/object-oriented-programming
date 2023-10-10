package ex2;

public class Prato {

	private int numero;
	private String nomePrato;
	private String tipo; //MUDAR PARA ENUM
	private String ingredientes;
	private double precoUnitario;
	
	public Prato(int numero, String nomePrato, String tipo, String ingredientes, double precoUnitario) {
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
	public String getTipo() {
		return tipo;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
}
