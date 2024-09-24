package mastery;

public class Account {

private double balance;
private Customer cust;
private String AcctID;	
	

public Account(String fname, String lname, double bal) {
}

public String getID() {
return(AcctID);
}
	
public double getbalance() {
return(balance);
}	

public void deposit (double amt) {
balance += amt;
}

public void withdrawl(double amt) {
	if (amt <= balance) {
	balance -= amt;
	}else {
	System.out.print("Not enough money in account");
	}
}

public boolean equals(Object acct) {
Account testAcct = (Account)acct;
if (AcctID.equals(testAcct.AcctID)) {
return(true);
} else {
return(false);
}
}
}
