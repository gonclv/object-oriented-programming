package aula03;

public class PedidoTeste {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(111, "17/08/2023");
		pedido1.verificarPedido();
		pedido1.alterarStatus(Status.PROCESSANDO);
		pedido1.verificarPedido();
	}
}
