package ex4;

public class Main {
    
    public static void main(String[] args) {
        Filme filme1 = new Filme("O preço do alvorescer", 120, 20);
        filme1.imprimirRelatorio();
        
        Filme filme2 = new Filme("A culpa é das estrelas", 100, 30);
        
        Cliente cliente1 = new Dependente();
        Cliente cliente2 = new Socio();
    				
        filme2.realizarLocacao(cliente1, 20);
        filme2.realizarDevolucao(25);
        
        filme1.realizarLocacao(cliente2, 10);
        filme1.realizarDevolucao(12);
        
        filme1.imprimirRelatorio();
        System.out.println("==========");
        filme2.imprimirRelatorio();
    }
    
}