package aula06.sobreposicao;

import java.util.Scanner;

public class MamiferoTeste {

	public static void main(String[] args) {
		Mamifero mamifero = null;
		
		System.out.println("1 - Gato");
		System.out.println("2 - Cachorro");
		System.out.println("3 - Cavalo");
		
		Scanner input = new Scanner(System.in);
		int opcao = input.nextInt();
		input.close();
		
		switch(opcao) {
			case 1:
				mamifero = new Gato("Luna", "Persa");
				break;
			case 2:
				mamifero = new Cachorro("Rex", "Fila");
				break;
			case 3:
				mamifero = new Cavalo("Ponei", "Avelin");
				break;
		}
		mamifero.emitirSom();
		
		if(mamifero instanceof Cachorro) {
			((Cachorro) mamifero).brincar();
		}
	}
}
