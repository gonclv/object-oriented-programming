package aula01;

public class Carro {
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;

	public Carro(String modelo, String marca, int ano, String placa, String cor) {
		this.modelo = modelo; //this: refere-se a variavel da instância (observe cor)
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
	}
	
	public void ligar() {
		
	}
	
	public void desligar() {
		
	}

	public void acelerar() {
		
	}

	public void frear() {
		
	}
	
	public String getPlaca() {
		return this.placa;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
}
