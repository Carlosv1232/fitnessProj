package project;
import java.text.SimpleDateFormat;
import java.util.Date;


public class customer extends User{

	String date_joined;	//constructor will initialize this variable
	Boolean status;	//true for members that are active, false for those who aren't
	
	public customer(String fn, String ln, String user, String pass) {
		super(fn, ln, user, pass);
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		status = true;	//when customer initially signs up, their status will be true
		
		date_joined = formatter.format(date);	//returns the day the class was constructed
	}
	
	public String toString() {	//this will be used for displaying data
		return (super.toString() + "_" + date_joined + "_" + status);
	}
	
	public String fullToString() {	//this will only be used for storing the users information into the text file
		String result = super.allInfo() + "_" + date_joined + "_" + status;
		return result;
	}
	
	//The getters and setters are inherited from the user class!
	
	public Boolean getStatus() {
		return status;
	}
	
	//since Customer extends to User, employee could use checkSignIn(String user, String pass), returns boolean
	
}
