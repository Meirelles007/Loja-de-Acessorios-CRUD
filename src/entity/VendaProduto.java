package entity;

public class VendaProduto {

	private int codProduto;
	private int quantidade;
	private int numeroVenda;

	public int getProduto() {
		return codProduto;
	}

	public void setCodProduto(int codproduto) {
		this.codProduto = codproduto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getNumeroVenda() {
		return numeroVenda;
	}

	public void setNumeroVenda(int numeroVenda) {
		this.numeroVenda = numeroVenda;
	}

	@Override
	public String toString() {
		return "Cliente [codproduto=" + codProduto + ", Quantidade=" + quantidade + ", NumeroVenda=" + numeroVenda
				+ "]";
	}

}
