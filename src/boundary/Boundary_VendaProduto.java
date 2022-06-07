package boundary;

import controller.VendasController;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Boundary_VendaProduto extends Application {
	
	VendasController control = new VendasController();
	
	
	Button btnVendas = new Button("Vendas");
	Button btnConsultar = new Button("Consultar");

	
	TextField txtCod_Produto = new TextField();
	TextField txtQuantidade = new TextField();
	TextField txtNumero_Vendas = new TextField();
	TextField txtNumero_venda = new TextField();
	
	
	public void start(Stage Stage) throws Exception {
		
		
		BorderPane tela_pane = new BorderPane();
		
		Label titulo = new Label("Vendas de Produtos");
		titulo.setStyle("-fx-font: 20 arial;-fx-font-weight: bold");
		titulo.setAlignment(Pos.CENTER);
		
		GridPane vendas_pane = new GridPane();
		
		vendas_pane.add(new Label("Codigo do Produto:"), 0, 0);
		vendas_pane.add(txtCod_Produto, 1, 0);
		
		vendas_pane.add(new Label("Quantidade:"), 0, 1);
		vendas_pane.add(txtQuantidade, 1, 1);
		
		vendas_pane.add(new Label("Numero de Vendas:"), 0, 2);
		vendas_pane.add(txtNumero_Vendas, 1, 2);
		
		vendas_pane.add(new Label("Numero de venda:"), 3, 0);
		vendas_pane.add(txtNumero_venda, 4, 0);
		
		vendas_pane.setHgap(5);
		vendas_pane.setVgap(10);
		vendas_pane.setStyle("-fx-font: 15 arial;-fx-font-weight: bold");
		vendas_pane.setAlignment(Pos.CENTER);
		
		vendas_pane.add(btnVendas, 0, 5);
		vendas_pane.add(btnConsultar, 3, 5);
		
		vendas_pane.setVgap(5);
		vendas_pane.setHgap(20);
		vendas_pane.setStyle("-fx-font: 15 arial;-fx-font-weight: bold");
		vendas_pane.setAlignment(Pos.CENTER);
		
		Bindings.bindBidirectional(txtCod_Produto.textProperty(), control.codigoProdutoProperty());
		Bindings.bindBidirectional(txtQuantidade.textProperty(), control.quantidadeProperty());
		Bindings.bindBidirectional(txtNumero_venda.textProperty(), control.numeroVendaProperty());
		
		btnVendas.setOnAction(e -> control.adicionar());
		btnConsultar.setOnAction(e -> control.pesquisar());

		
		tela_pane.setTop(titulo);
		tela_pane.setCenter(vendas_pane);

		
        Scene snc = new Scene(tela_pane , 800, 600);
        
		Stage.setResizable(false);
		Stage.setScene(snc);
		Stage.show();
	}		
		public static void main(String[] args) {
			Application.launch(Boundary_VendaProduto.class);
		
	}

}
