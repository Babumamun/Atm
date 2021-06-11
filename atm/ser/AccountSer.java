package atm.ser;

import java.io.Serializable;

public class AccountSer implements Serializable{
	
	String cardnum;
	
	String pwd;
	
	double balance;
	
   public AccountSer(String s1, String s2,double d) {
		cardnum=s1;
		pwd=s2;
		balance=d;
	}

	
	

	public String getCardnum() {
		return cardnum;
	}

	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountSer [cardnum=" + cardnum + ", pwd=" + pwd + ", balance=" + balance + "]";
	} 
	

	
	
}
