package OpenAccount;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OpenAccount extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Open Account");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("OpenAccount.fxml"));
		loader.setController(new OpenAccountController(stage));
		Parent root = loader.load();
	  Scene scene = new Scene(root,600,400);
	  stage.setScene(scene);
	  stage.show();
	 
	
	}
	
	

}
