package aula06.exercicio1;

import java.util.Scanner;

public class TesteQuadrilatero {

	public static void main(String[] args) {
		Quadrilatero quadrilatero1 = null;
		
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retangulo");
		System.out.println("3 - Losango");
		
		Scanner input = new Scanner(System.in);
		int opcao = input.nextInt();
		input.close();
		
		switch(opcao) {
			case 1:
				quadrilatero1 = new Quadrado(15, "Vermelho");
				break;
			case 2:
				quadrilatero1 = new Retangulo(20, 10, "Branco");
				break;
			case 3:
				quadrilatero1 = new Losango(30, 15, "Azul");
				break;
			default: return;
		}
		
		quadrilatero1.calcularArea();
		quadrilatero1.calcularPerimetro();
	}
}
