package Aula01.saidadados;

public class ExemploSaidaDados {

	public static void main(String[] args) {
		String aluno = "Danilo Gonçalves";
		int periodo = 4;
		double coeficiente = 0.87;
		String disciplina = "Programação Orientada a Objetos";
		
		System.out.println("Universidade Tecnológica Federal do Paraná");
		System.out.println(aluno + " está no " + periodo + "º período e possui coeficiente " + coeficiente);
		System.out.printf("A disciplina %s é do %dº período\n", disciplina, periodo);
	}
}
