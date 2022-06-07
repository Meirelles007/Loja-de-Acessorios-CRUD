package entity;

public class CadastroProduto {

	private int codigoProduto;
	private String produto;
	private String categoria;
	private String carro;
	private float ano;
	private String modelo;
	private double valor;

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int id) {
		this.codigoProduto = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	public float getAno() {
		return ano;
	}

	public void setAno(float ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [id=" + codigoProduto + ", produto=" + produto + ", categoria=" + categoria + ", carro=" + carro
				+ ", ano=" + ano + ", modelo=" + modelo + ", valor=" + valor + "]";
	}
}
