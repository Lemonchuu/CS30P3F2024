package mastery;

public class Customer 
{

private String fname, lname;

public Customer(String fname, String lname) 
{
fname = fname;
lname = lname;
}
	
public String toString() 
{
String custString;
custString = fname + " " + lname + "\n";
return(custString);
}
}

