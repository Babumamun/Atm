package atm;

import java.io.IOException;

import atm.controller.MenuController;
import atm.ser.AccountSer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartMenuWin {
  
public void display () throws IOException{
		
		Stage stage = new Stage();
		
		stage.setTitle("Transaction");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Menu.fxml"));
		loader.setController(new MenuController());
		Parent root = loader.load();
		Scene scene = new Scene (root,600,400);
		stage.setScene(scene);
		
		stage.show();
}
}