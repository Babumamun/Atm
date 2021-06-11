package atm.controller;
import java.io.IOException;
import java.util.List;

import AccountModel.AccountService;
import atm.StartAlertWin;
import atm.StartMenuWin;
import atm.ser.AccountSer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VaildateController {
	   private Stage stage;
	   List<AccountSer> list;
	@FXML
    private TextField cardid;
	
    @FXML
    private TextField pwd;
    
    @FXML
    private Button ok;

    public VaildateController(Stage stage) {
    	this.stage=stage;
    	list=AccountService.getAllAccountSers(); 
    }

	@FXML
    void onOKClick(ActionEvent event) throws Exception {
       	
     String id=cardid.getText();
     
     String passw= pwd.getText(); 
     AccountSer account =AccountService.vaildate(id, passw);
     
    if(account!=null) {
    	StartMenuWin smw= new StartMenuWin();
    try {
		smw.display();
	} catch (IOException e) {
	
		e.printStackTrace();
	}
    	
     }  else {
	StartAlertWin saw=new StartAlertWin();
	try {
		saw.alertdisplay();
	} catch (IOException e) {
	e.printStackTrace();
	}
   }
   }
  }