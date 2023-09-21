package aula03.exemplo2;

public enum DiaSemana {

	DOMINGO(1, "Domingo"),
	SEGUNDA(2, "Segunda-feira"),
	TERCA(3, "Terça-feira"),
	QUARTA(4, "Quarta-feira"),
	QUINTA(5, "Quinta-feira"),
	SEXTA(6, "Sexta-feira"),
	SABADO(7, "Sábado");
	
	private int numero;
	private String dia;
	
	private DiaSemana(int numero, String dia) {
		this.numero = numero;
		this.dia = dia;
	}

	public int getNumero() {
		return numero;
	}

	public String getDia() {
		return dia;
	}
}
