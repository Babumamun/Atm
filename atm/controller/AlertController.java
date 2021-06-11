package atm.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class AlertController {
	private Stage stage;
    @FXML
    private Button alertbtn;
	

    public AlertController(Stage stage) {
		// TODO Auto-generated constructor stub
    	
    	this.stage=stage;
	}

	@FXML
    void onClickAlert(ActionEvent event) {
    	
   
    stage.close();
    
    }
    
}