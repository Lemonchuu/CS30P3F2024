package mastery;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank 
{
 private ArrayList accounts;
	
  
  public Bank() 
  {
		
	accounts = new ArrayList();
		

  }
	
  public String addAccount(String fname, String lname, double balance)
  {
		Account newAcct = new Account(fname, lname, balance);
		accounts.add(newAcct);
		return(newAcct.getID ());
		}
		
		
		
	}


