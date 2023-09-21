package ex2;

public class ImovelVelho extends Imovel {

	private double valorDesconto;
	
	public ImovelVelho(String endereco, double valorBase, double valorDesconto) {
		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	@Override
	public void imprimirDados() {
		//System.out.println("Endereço: " + endereco);
        //System.out.println("Valor Base: R$" + String.format("%.2f", valorBase));
		super.imprimirDados();
        System.out.println("Valor Desconto: R$" + String.format("%.2f", valorDesconto));
        System.out.println("Valor total: R$" + String.format("%.2f", valorBase - valorDesconto));
	}
}
