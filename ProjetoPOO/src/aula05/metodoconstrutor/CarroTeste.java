package aula05.metodoconstrutor;

public class CarroTeste {

	public static void main(String[] args) {
		Carro carro1 = new Carro("458 Italia", "Ferrari", 2005, "AYA-1919", "Amarelo");
		Carro carro2 = new Carro("Civic", "Honda", 2010);
		Carro carro3 = new Carro("XYZ-6789");
		
		carro2.ligar();
		carro1.ligar();
		carro1.acelerar();
		
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
	}
}

