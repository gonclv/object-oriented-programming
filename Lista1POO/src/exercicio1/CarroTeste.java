package exercicio1;

public class CarroTeste {

	public static void main(String[] args) {
		Carro carro1 = new Carro("458 Italia", "Ferrari", "Amarelo", 2005, 10203040, "ABCDEFG", "AYA-1919");
		Carro carro2 = new Carro("Civic", "Honda", "Azul", 2010, 30405060, "FGHIJK", "AAA-1234");
		Carro carro3 = new Carro("Fusca", "Wolkswagen", "Azul", 1989, 708090100, "LMNOPQ", "XYZ-6789");
		
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
	}
}
