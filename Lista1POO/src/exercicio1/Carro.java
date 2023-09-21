package exercicio1;

public class Carro {

	private String modelo;
	private String marca;
	private String cor;
	private int ano;
	private int renavam;
	private String chassi;
	private String placa;
	
	public Carro(
			String modelo,
			String marca,
			String cor,
			int ano,
			int renavam,
			String chassi,
			String placa) {
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
		this.renavam = renavam;
		this.chassi = chassi;
		this.placa = placa;
	}
	
	public void ligar() {
		System.out.println(this.marca + this.modelo + " está ligando");
	}
	
	public void desligar() {
		System.out.println(this.marca + this.modelo + " está desligando");
	}
	
	public void acelerar() {
		System.out.println(this.marca + this.modelo + " está acelerando");
	}
	
	public void frear() {
		System.out.println(this.marca + this.modelo + " está freando");
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", renavam=" + renavam
				+ ", chassi=" + chassi + ", placa=" + placa + "]";
	}
}
