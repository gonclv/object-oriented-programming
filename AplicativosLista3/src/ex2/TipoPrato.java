package ex2;

public enum TipoPrato {
	ENTRADA("Entrada"),
	PRINCIPAL("Principal"),
	SOBREMESA("Sobremesa");
	
	private String tipo;
	
	private TipoPrato(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}
