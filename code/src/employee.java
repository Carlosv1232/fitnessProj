import java.lang.*;
//import java.lang.Boolean;

public class employee extends User {

	boolean isHired;	//this will determine if an employee still has rights to a hired employee
	boolean isManager;	//managers will be given access to more functionality
	//more values may be added during the development phase
	
	//employee will be able to clock in and out, include total time worked, 
	
	
	public employee(String fn, String ln, int id, Boolean h) {
		super(fn, ln, id);	//passes the values to the inherited class constructor
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
		return (super.toString() + "," + isHired);
	}

}
