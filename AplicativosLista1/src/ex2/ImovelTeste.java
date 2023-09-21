package ex2;

public class ImovelTeste {

	public static void main(String[] args) {
		ImovelNovo im1 = new ImovelNovo("Rua da Saudade", 350000.00, 49999.99);
		ImovelVelho im2 = new ImovelVelho("Rua do Brasil", 200000.00, 29999.99);
		
		im1.imprimirDados();
		im2.imprimirDados();
	}
}
