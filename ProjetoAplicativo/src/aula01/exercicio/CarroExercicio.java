package aula01.exercicio;

public class CarroExercicio {

	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	double velocidade;
	boolean ligado;
	
	public CarroExercicio(String modelo, String marca, int ano, String placa, String cor) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.velocidade = 0;
		this.ligado = false;
	}
	
	public void ligar() {
		if(!ligado) {
			ligado = true;
		}
	}
	
	public void desligar() {
		if(velocidade > 0) {
			System.out.println("Desacelere o carro!");
		}
		else {
			ligado = false;
		}
	}

	public void acelerar() {
		if(velocidade > 250) {
			System.out.println("Velocidade máxima atingida");
		}
		else if(velocidade > 150) {
			velocidade = 250;
		}
		else {
			velocidade = velocidade + 100;
		}
	}

	public void frear() {
		if(velocidade == 0) {
			System.out.println("O carro está parado");
		}
		else if(velocidade < 100) {
			velocidade = 0;
		}
		else {
			velocidade = velocidade - 100;
		}
	}

	@Override
	public String toString() {
		return "CarroExercicio [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor="
				+ cor + ", velocidade=" + velocidade + ", ligado=" + ligado + "]";
	}
}
