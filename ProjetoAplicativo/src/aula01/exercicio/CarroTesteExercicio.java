package aula01.exercicio;

public class CarroTesteExercicio {
	public static void main(String[] args) {
		CarroExercicio carro1 = new CarroExercicio("Civic", "Honda", 2010, "ABC-1234", "Vermelho");
		CarroExercicio carro2 = new CarroExercicio("Fusca", "Wolkswagen", 1989, "DDD-0000", "Azul");
		
		System.out.println(carro1);
		System.out.println(carro2);
		
		carro2.ligar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		System.out.println(carro2);
		
		carro2.desligar();
		carro2.frear();
		carro2.frear();
		carro2.frear();
		carro2.frear();
		carro2.desligar();
		System.out.println(carro2);
		
		carro1.desligar();
		System.out.println(carro1);
	}
}
