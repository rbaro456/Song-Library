package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SongLib extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader();
		//loader.setLocation();  // Set loader to FXML file when finished
		
		//BorderPane root = (BorderPane)loader.load(); // Loads the main layout from FXML
		//Main layout is not necessarily a BorderPane it is just a PLACE HOLDER
		
		
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}

}
