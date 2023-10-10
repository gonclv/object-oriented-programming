package ex4;

public class Main {
    
    public static void main(String[] args) {
        Filme filme1 = new Filme("O preço do alvorescer", 120, 20);        
        Filme filme2 = new Filme("A culpa é das estrelas", 100, 30);
        
        Cliente cliente1 = new Dependente("Danilo", "31/12/1999", 12345678, null);
        Cliente cliente2 = new Socio("Laura", "01/01/2000", 12345678, null, 111222333);
    				
        try {
			filme2.realizarLocacao(cliente1, 20);
			filme2.realizarDevolucao(25);
	        
	        filme1.realizarLocacao(cliente2, 10);
	        filme1.realizarDevolucao(12);
		} catch (FilmeLocadoException | FilmeNaoLocadoException e) {
			e.getMessage();
		}
    }
}