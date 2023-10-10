package ex2;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Danilo G.", 111222333);
		Cliente cliente2 = new Cliente("Laura G.", 222333444);
		
		Prato prato1 = new Prato(1, "Espaguete", TipoPrato.PRINCIPAL, "Macarrão", 4.00);
		Prato prato2 = new Prato(2, "Arroz com Passas", TipoPrato.PRINCIPAL, "Arroz, Uvas Passas", 2.50);
		Prato prato3 = new Prato(3, "Gelatina", TipoPrato.SOBREMESA, "Água, Pó de Gelatina", 1.50);
		Prato prato4 = new Prato(1, "Salada de Frutas", TipoPrato.ENTRADA, "Maçã, Laranja, Banana, Mamão", 1.00);
		
		cliente1.getConta().adicionarPrato(prato1);
		cliente1.getConta().adicionarPrato(prato3);
		cliente1.getConta().adicionarPrato(prato4);
		
		cliente2.getConta().adicionarPrato(prato2);
		
		cliente1.getConta().fecharConta();
		cliente2.getConta().fecharConta();
	}
}
