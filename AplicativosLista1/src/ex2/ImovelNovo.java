package ex2;

public class ImovelNovo extends Imovel {

	private double valorAdicional;
	
	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public void imprimirDados() {
		//System.out.println("Endereço: " + endereco);
        //System.out.println("Valor Base: R$" + String.format("%.2f", valorBase));
		super.imprimirDados();
        System.out.println("Valor Adicional: R$" + String.format("%.2f", valorAdicional));
        System.out.println("Valor total: R$" + String.format("%.2f", valorBase + valorAdicional));
	}
}