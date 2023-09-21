package aula07.clausulathrows;

public class Letra {
	
	public void compararStrings(String a, String b) throws Exception {
		if(a == b) {
			System.out.println("As strings são iguais");
		}
		else {
			System.out.println("As strings são diferentes");
		}
	}

	public void contarCaracteres(String a) throws Exception {
		System.out.println("A string contém " + a.length() + " caracteres");
	}
	
	public void converterMinusculo(String a) throws Exception {
		System.out.println("String em minúsculo: "+ a.toLowerCase());
	}
	
	public void converterMaiusculo(String a) throws Exception {
		System.out.println("String em maiúsculo: "+ a.toUpperCase());
	}
}
