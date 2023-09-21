package Aula01.entradadados;

import java.util.Scanner;

public class ExemploEntradaDados {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String nome = input.nextLine();
		System.out.println("Informe o período:");
		int periodo = input.nextInt();
		System.out.println("Informe o coeficiente:");
		double coeficiente = input.nextDouble();
		input.nextLine(); //Para consumir a quebra de linha deixada pelo nextDouble
		System.out.println("Informe o nome da disciplina:");
		String disciplina = input.nextLine();
		
		System.out.println(nome + " está no " + periodo + "º período e possui coeficiente " + coeficiente);
		System.out.printf("A disciplina %s é do %dº período.\n", disciplina, periodo);
		
		input.close();
	}
}
