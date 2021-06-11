package atm;

import java.io.IOException;

import atm.controller.StartController;
import atm.controller.VaildateController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartVaildateWin {

	public void display () throws IOException{
		
		Stage stage = new Stage();
		
		stage.setTitle("Vaildate");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/validate.fxml.fxml"));
		loader.setController(new VaildateController(stage));
		Parent root = loader.load();
		Scene scene = new Scene (root,600,400);
		stage.setScene(scene);
		
		stage.show();
		
		
		
		
	}
}
