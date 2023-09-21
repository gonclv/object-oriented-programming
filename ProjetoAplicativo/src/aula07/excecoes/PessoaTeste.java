package aula07.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			//TODO: corrigir as linhas do input q estao pulando
			
			System.out.println("Digite os dados: ");
			String nome = input.nextLine();
			int idade = input.nextInt();
			int cpf = input.nextInt();
			String logradouro = input.nextLine();
			int numero = input.nextInt();
			String bairro = input.nextLine();
			String cidade = input.nextLine();
			String estado = input.nextLine();
			int cep = input.nextInt();
			
			Pessoa pessoa1 = new Pessoa(nome, idade, cpf, logradouro, numero, bairro, cidade, estado, cep);
			
			System.out.println(pessoa1);
		}
		catch (InputMismatchException ime) {
			System.out.println("Erro: entada de dados inválida.");
		}
		catch (Exception e) {
			System.out.println("Ocorreu um erro.");
		}
		finally {
			input.close();
		}
	}
}
