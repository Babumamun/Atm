package AccountModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import atm.ser.AccountSer;

public class AccountService {
	

	public static void writeObjToFile(ArrayList<AccountSer>list)throws Exception{
		FileOutputStream fileOutputStream = 
				new FileOutputStream("/Users/mac/eclipse-workspace/ATMFX/MyAccout.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(list);
		objectOutputStream.close();
	}
	
	
	public static List<AccountSer>getAllAccountSers(){
		ArrayList<AccountSer>list= new ArrayList<AccountSer>();
		FileInputStream fis;
		try {	
		fis=new FileInputStream("/Users/mac/eclipse-workspace/ATMFX/MyAccout.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		list=(ArrayList<AccountSer>)ois.readObject();
		
	}catch (FileNotFoundException e) {
	e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
		return list;
}


	
	public static AccountSer vaildate (String s1,String s2) {
		List<AccountSer>list=new ArrayList<>();
    	AccountSer account =null;
    	boolean res = false;
    	for (int i=0;i<list.size();i++) {
    		account=list.get(i);
    		if((s1.equals(account.getCardnum()))&(s2.equals(account.getPwd()))){
    			res=true;
    			
    			break;
    		}
    	}
    	if(res)
    		return account;
   
    else {
    	return null;
    }
		
 
    	
    	
    	
    	
    }
}
	