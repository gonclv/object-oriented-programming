package ex1;

public class SessaoTeste {

	public static void main(String[] args) {
		Sala sala1 = new Sala(1000, 200);
		Filme filme1 = new Filme("O preço do alvorescer", 120);
		
		Sessao sessao1 = new Sessao("01/01/2000", "10:00", sala1, filme1);
		
		Sessao sessao2 = new Sessao("31/12/2010", "12:00", 1020, 300, "The Eras Tour Movie", 200);
		
		sessao1.venderIngressos(10);
		sessao2.venderIngressos(5);
		sessao1.venderIngressos(150);
		sessao1.venderIngressos(50);
		sessao2.venderIngressos(1000);
		
		System.out.println("=============");
		sessao1.imprimirDados();
		System.out.println("=============");
		sessao2.imprimirDados();
	}
}
