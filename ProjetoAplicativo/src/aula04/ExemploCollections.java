package aula04;

import java.util.List;

import aula01.Carro;

import java.util.ArrayList;

public class ExemploCollections {

	public static void main(String[] args) {
		List<Integer> lista1 = new ArrayList<Integer>();
		List<String> lista2 = new ArrayList<String>();
		List<Boolean> lista3 = new ArrayList<Boolean>();
		List<Carro> lista4 = new ArrayList<Carro>();
		
		Carro carro1 = new Carro("458 Italia", "Ferrari", 2018, "AAA-1234", "Vermelho");
		Carro carro2 = new Carro("Civic", "Honda", 2020, "MMO-9876", "Prata");
		Carro carro3 = new Carro("Fusca", "Wolkswagen", 1989, "XYZ-5678", "Azul");
		
		lista1.add(150);
		
		lista2.add("João");
		lista2.add("Maria");
		lista2.add("Pedro");
		
		lista3.add(true);
		lista3.add(false);
		
		lista4.add(carro1);
		lista4.add(carro2);
		lista4.add(carro3);
		
		for(int i = 0; i < lista4.size(); i++) {
			Carro carro = lista4.get(i);
			System.out.println(carro.getPlaca()); //lista4.get(i).getPlaca()
		}
		
		for(Carro carro : lista4) {
			System.out.println(carro.getPlaca());
		}
	}
}
