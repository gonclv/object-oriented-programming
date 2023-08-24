package aula04.métodos;

public class Carro {

	//atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado = false;
	
	//métodos da classe Carro
	public void ligar() {
		if(!ligado) {
			System.out.println(marca + " " + modelo + " está ligando");
			ligado = true;
		}
		else {
			System.out.println(marca + " " + modelo + "já está ligado");
		}
	}
	
	public void desligar() {
		System.out.println(marca + " " + modelo + " está desligando");
	}
	
	public void acelerar() {
		System.out.println(marca + " " + modelo + " está acelerando");
	}
	
	public void frear() {
		System.out.println(marca + " " + modelo + " está freando");
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
	
	
}
