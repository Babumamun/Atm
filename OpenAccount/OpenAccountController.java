package OpenAccount;


import java.util.ArrayList;
import java.util.List;

import AccountModel.AccountService;
import atm.ser.AccountSer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class OpenAccountController {
	private Stage stage;
	ArrayList<AccountSer>list=new ArrayList<>();
		@FXML
	    private TextField cardnum;

	    @FXML
	    private Button btn1openaccount;

	    @FXML
	    private Button btn3inquery;

	    @FXML
	    private Button btn2reset;

	    @FXML
	    private TextArea textarea;

	    @FXML
	    private TextField pwd;

	    @FXML
	    private TextField initialbalance;

	    public OpenAccountController(Stage stage)  {
	    	this.stage=stage;
	    	try {
	    		list = (ArrayList<AccountSer>)AccountService.getAllAccountSers();
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
		}

		@FXML
	    void onClickOpenAccount(ActionEvent event) {
	    	
	    	String card=cardnum.getText();
	    	if(isDup(card)) {
	    		System.out.println("Duplicated Card number!");
	    	}else {
	    		
	    		
	    		 String pass=pwd.getText();
	    		 
	 	       double balance= Double.parseDouble(initialbalance.getText());
	 	      AccountSer accountSer= new AccountSer(cardnum.getText(),pwd.getText(),balance);
	 	
		          list.add(accountSer);
	 	  
				try {
					AccountService.writeObjToFile(list);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			
		}
	 	    textarea.setText("Open Accout Sucess!");	
	    	}
	

	    private boolean isDup(String card) {
			boolean dup=false;
			
			for(AccountSer acc:list) {
				if(card.equals(acc.getCardnum()))
						dup = true;
			}
			return dup;
		}

		@FXML
	    void onClickReset(ActionEvent event) {
	    	cardnum.clear();
	    	pwd.clear();
	    	initialbalance.clear();

	    }

	    @FXML
	    void onClickInquiry(ActionEvent event) {
	    	StringBuilder stringBuilder= new StringBuilder();
	    	for(AccountSer accountSer:list)
	    		stringBuilder.append(accountSer.toString()+"\n");
	    	 textarea.setText(stringBuilder.toString());
	    }

	    @FXML
	    void onClickExit(ActionEvent event) {
	     stage.close();
	    	
	    	
	    }


    }


