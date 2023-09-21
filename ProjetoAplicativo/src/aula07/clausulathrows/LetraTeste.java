package aula07.clausulathrows;

public class LetraTeste {

	public static void main(String[] args) {
		Letra letra1 = new Letra();
		
		try {
			letra1.compararStrings("String de Teste", "String para Teste");
		}
		catch (Exception e) {
			System.out.println("Ocorreu um erro.");
		}
	}
}
