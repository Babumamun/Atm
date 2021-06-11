package atm.controller;

import java.io.IOException;

import atm.StartVaildateWin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartController {

    @FXML
    private Button startBtn;

	@FXML
    void onClickStart(ActionEvent event) {
      //System.out.println("Start");
    	StartVaildateWin n = new StartVaildateWin();
    	try {
    		n.display();
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    }

}
