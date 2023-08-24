package aula04.métodos;

public class CarroTeste {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		carro1.modelo = "458 Italia";
		carro1.marca = "Ferrari";
		carro1.ano = 2005;
		carro1.placa = "AYA-1919";
		carro1.cor = "Amarelo";
		
		carro2.modelo = "Gol";
		carro2.marca = "Wolkswagen";
		carro2.ano = 1999;
		carro2.placa = "ZZZ-0001";
		carro2.cor = "Vermelho";
		
		carro3.modelo = "Civic";
		carro3.marca = "Honda";
		carro3.ano = 2010;
		carro3.placa = "XYZ-6789";
		carro3.cor = "Branco";
		
		carro2.ligar();
		carro1.acelerar();
		carro3.ligar();
		
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
	}
}

