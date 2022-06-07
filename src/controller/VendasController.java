package controller;

import entity.VendaProduto;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class VendasController {

	private StringProperty codigoProduto = new SimpleStringProperty("");
	private StringProperty quantidade = new SimpleStringProperty("");
	private StringProperty numeroVenda = new SimpleStringProperty("");

	public StringProperty codigoProdutoProperty() {
		return codigoProduto;
	}

	public StringProperty quantidadeProperty() {
		return quantidade;
	}

	public StringProperty numeroVendaProperty() {
		return numeroVenda;
	}

	public VendaProduto boundaryToEntity() {
		VendaProduto p = new VendaProduto();
		try {
			p.setCodProduto(Integer.parseInt(codigoProduto.get()));

		} catch (NumberFormatException e) {
			System.out.println(e);
		}

		p.setQuantidade(Integer.parseInt(quantidade.get()));
		p.setNumeroVenda(Integer.parseInt(numeroVenda.get()));

		return p;
	}

	public void entityToBoundary(VendaProduto p) {
		if (p != null) {

			codigoProduto.set(String.valueOf(p.getProduto()));
			quantidade.set(String.valueOf(p.getQuantidade()));
			numeroVenda.set(String.valueOf(p.getNumeroVenda()));
			
		}
	}
	
	public void adicionar() {
		VendaProduto v = new VendaProduto();
		v = boundaryToEntity();
		
		
	}
	
	public void pesquisar() {
		VendaProduto v = new VendaProduto();
		entityToBoundary(v);
				
	}
}
