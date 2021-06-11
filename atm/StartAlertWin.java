package atm;

import java.io.IOException;

import atm.controller.AlertController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class StartAlertWin {

	public void alertdisplay () throws IOException{
		
        Stage stage = new Stage();
		
		stage.setTitle("Alert");
		stage.initModality(Modality.APPLICATION_MODAL);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/alert.fxml"));
		loader.setController(new AlertController(stage));
		Parent root = loader.load();
		Scene scene = new Scene (root,600,300);
		stage.setScene(scene);
		
		stage.show();
		
		
		
		
	}
}
