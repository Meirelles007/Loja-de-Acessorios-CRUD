package boundary;


import controller.VendasController;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Boundary_CadastroProdutos extends Application {
		
   VendasController control = new VendasController();
   
	
	
	Button btnCadastrar = new Button("Cadastrar");
	Button btnConsultar = new Button("Consultar");
	
	TextField txtCadastrar = new TextField();
	TextField txtConsultar = new TextField();
	
	TextField txtId = new TextField();
	TextField txtNomeproduto = new TextField();
	TextField txtCategoria = new TextField();
	TextField txtCarro = new TextField();
	TextField txtAno = new TextField();
	TextField txtModelo = new TextField();
	TextField txtValor = new TextField();
	
	

	public void start(Stage stage) throws Exception {

		BorderPane tela_pane = new BorderPane();
		
		Label titulo = new Label("Tela de cadastro de Material");
		titulo.setStyle("-fx-font: 24 arial;-fx-font-weight: bold");
		
				
		GridPane cadastro_pane = new GridPane();
		
		cadastro_pane.add(new Label("Id:"), 0, 0);
		cadastro_pane.add(txtId, 1, 0);
		
		cadastro_pane.add(new Label("Nome do Produto:"), 0, 1);
		cadastro_pane.add(txtNomeproduto, 1, 1);
		
		cadastro_pane.add(new Label("Categoria:"), 0, 2);
		cadastro_pane.add(txtCategoria, 1, 2);
		
		cadastro_pane.add(new Label("Carro:"), 0, 3);
		cadastro_pane.add(txtCarro, 1, 3);
		
		cadastro_pane.add(new Label("Ano:"), 0, 4);
		cadastro_pane.add(txtAno, 1, 4);
		
		cadastro_pane.add(new Label("Modelo:"), 0, 5);
		cadastro_pane.add(txtModelo, 1, 5);
		
		cadastro_pane.add(new Label("Valor:"), 0, 6);
		cadastro_pane.add(txtValor, 1, 6);
		
		cadastro_pane.setHgap(5);
		cadastro_pane.setVgap(10);
		cadastro_pane.setStyle("-fx-font: 18 arial;-fx-font-weight: bold");
		cadastro_pane.setAlignment(Pos.CENTER);
		
		Bindings.bindBidirectional(txtId.textProperty(), control.codigoProdutoProperty());
		Bindings.bindBidirectional(txtNomeproduto.textProperty(), control.produtoProperty());
		Bindings.bindBidirectional(txtCategoria.textProperty(), control.categoriaProperty());
		
		
		GridPane buttons_pane = new GridPane();
		
		buttons_pane.add(btnCadastrar, 0, 0);
		buttons_pane.add(btnConsultar, 0, 1);
		
		
		buttons_pane.setVgap(10);
		buttons_pane.setStyle("-fx-font: 18 arial;-fx-font-weight: bold");
		buttons_pane.setAlignment(Pos.CENTER);
		
		tela_pane.setTop(titulo);
		tela_pane.setCenter(cadastro_pane);
		tela_pane.setRight(buttons_pane);
				
		Scene snc = new Scene(tela_pane , 800, 600);
        
		stage.setResizable(false);
		stage.setScene(snc);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(Boundary_CadastroProdutos.class);

	}

}