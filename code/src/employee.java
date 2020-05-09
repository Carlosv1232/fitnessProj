import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.lang.Boolean;

public class employee extends User {

	String position;	//this will determine if an employee still has rights to a hired employee
	boolean isManager;	//managers will be given access to more functionality
	String date_joined;	//constructor will initialize this variable
	
	//employee will be able to clock in and out, include total time worked, 
	
	
	public employee(String fn, String ln, String user, String pass, String pos) {
		super(fn, ln, user, pass);	//passes the values to the inherited class constructor
									//sends First, last, username, password, and boolean isHired
		position = pos;
		isManager = false;	//we will initially set the isManager to false until value is changed to true
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		date_joined = formatter.format(date);	//returns the day the class was constructed
	}
	
	public employee(String fn, String ln, String user, String pass, String pos, String date, boolean manager) {
		//this constructor will be used for loading in data
		super(fn, ln, user, pass);
		position = pos;
		date_joined = date;
		isManager = manager;
	}
	
	public void changePosition(String pos) {
		position = pos;
	}
	
	public void changeManager(Boolean m) {
		isManager = m;
	}
	
	public boolean returnManager() {
		return isManager;
	}
	
	
	public String toString() {
		return (super.toString() + "_" + position + "_" + isManager + "_" + date_joined);	
		//returns: FirstName_LastName_Username_ + boolean isHired
								
	}

	//since employee extends to User, employee could use checkSignIn(String user, String pass), returns boolean
	
}
