package aula01;

public class CarroTeste {

	public static void main(String[] args) {
		
		//Criação de instâncias da classe Carro
		Carro carro1 = new Carro("458 Italia", "Ferrari", 2018, "AAA-1234", "Vermelho");
		Carro carro2 = new Carro("Civic", "Honda", 2020, "MMO-9876", "Prata");
		Carro carro3 = new Carro("Fusca", "Wolkswagen", 1989, "XYZ-5678", "Azul");
		
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
	}
}
