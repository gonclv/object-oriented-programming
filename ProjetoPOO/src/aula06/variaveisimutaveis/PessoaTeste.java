package aula06.variaveisimutaveis;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(1234567890, "João da Silva", "29/11/2000", 99999999, "jao@gmail.com", "Solteiro");
		Pessoa pessoa2 = new Pessoa(333444555, "Maria da Silva", "15/12/1999", 88665578, "mariazinha@gmail.com", "Casada");
		Pessoa pessoa3 = new Pessoa(999555000, "Joana de Almeida", "10/11/1950", 934527999, "almeida@gmail.com", "Viúva");
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
	}
}
