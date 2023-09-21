package ex2;

public class Imovel {

	protected String endereco;
	protected double valorBase;
	
	public Imovel(String endereco, double valorBase) {
		this.endereco = endereco;
		this.valorBase = valorBase;
	}

	public String getEndereco() {
		return endereco;
	}

	public double getValorBase() {
		return valorBase;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}
	
	public void imprimirDados() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor Base: R$" + String.format("%.2f", valorBase));
    }
}
