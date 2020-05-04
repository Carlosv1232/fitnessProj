import java.lang.*;
//import java.lang.Boolean;

public class employee extends User {

	boolean isHired;	//this will determine if an employee still has rights to a hired employee
	boolean isManager;	//managers will be given access to more functionality
	//more values may be added during the development phase
	
	//employee will be able to clock in and out, include total time worked, 
	
	
	public employee(String fn, String ln, String user, String pass, Boolean h) {
		super(fn, ln, user, pass);	//passes the values to the inherited class constructor
									//sends First, last, username, password, and boolean isHired
		isHired = h;
		isManager = false;	//we will initially set the isManager to false until value is changed to true
	}
	
	
	public void changeHire(Boolean h) {
		isHired = h;
	}
	
	public void changeManager(Boolean m) {
		isManager = m;
	}
	
	public boolean returnManager() {
		return isManager;
	}
	
	public String toString() {
		return (super.toString() + "_" + isHired + "_" + isManager);	
		//returns: FirstName_LastName_Username_ + _boolean isHired, 
								
	}

	//since employee extends to User, employee could use checkSignIn(String user, String pass), returns boolean
	
}
