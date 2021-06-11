package atm;

import atm.controller.StartController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartWin extends Application {

	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Welcome");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Start.fxml"));
		loader.setController(new StartController());
		Parent root = loader.load();
		Scene scene = new Scene (root,600,400);
		stage.setScene(scene);
		
		stage.show();
	}
	

	

}
