package controller;

import entity.CadastroProduto;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CadastroController {

	private StringProperty codigoProduto = new SimpleStringProperty("");
	private StringProperty produto = new SimpleStringProperty("");
	private StringProperty categoria = new SimpleStringProperty("");
	private StringProperty carro = new SimpleStringProperty("");
	private StringProperty ano = new SimpleStringProperty("");
	private StringProperty modelo = new SimpleStringProperty("");
	private StringProperty valor = new SimpleStringProperty("");

	public StringProperty codigoProdutoProperty() {
		return codigoProduto;
	}

	public StringProperty produtoProperty() {
		return produto;
	}

	public StringProperty categoriaProperty() {
		return categoria;
	}

	public StringProperty carroProperty() {
		return carro;
	}

	public StringProperty anoProperty() {
		return ano;
	}

	public StringProperty modeloProperty() {
		return modelo;
	}

	public StringProperty valorProperty() {
		return valor;
	}

	public CadastroProduto boundaryToEntity() {
		CadastroProduto c = new CadastroProduto();
		try {
			c.setCodigoProduto(Integer.parseInt(codigoProduto.get()));
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		c.setProduto(produto.get());
		c.setCategoria(categoria.get());
		c.setCarro(carro.get());
		try {
			c.setAno(Float.parseFloat(ano.get()));
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		c.setModelo(modelo.get());
		c.setValor(Double.parseDouble(valor.get()));
		return c;
	}

	public void entityToBoundary(CadastroProduto c) {
		if (c != null) {
			codigoProduto.set(String.valueOf(c.getCodigoProduto()));
			produto.set(c.getProduto());
			categoria.set(c.getCategoria());
			carro.set(c.getCarro());
			ano.set(String.valueOf(c.getAno()));
			modelo.set(c.getModelo());
			valor.set(String.valueOf(c.getValor()));
		}
	}
}
