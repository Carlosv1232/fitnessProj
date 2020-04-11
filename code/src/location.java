
import java.util.*;

public class location {

	String location;	//stores the name of the location
	String[] Services;	//this will contain everything that each location offers
	employee[] loc_emp;	//array to hold the location employees
	equiptment[] equip;	//holds all the equiptment that the location has
	String location_manager;	//manager object is going to be part of the loc_emp array
	int numOfEmp;	//number of employees at the location
	int emplLimit = 10;	//each location will be limited by 10 employees including the manager
	
	public location() {
		location = "";
		//Services must be added by the fileReader, or manually by 'manager'
	}
	
	public location(String loc, String serv[], employee emp[], String loc_man) {
		location = loc;
		loc_emp = new employee[emplLimit];
		//for loop to store services
		for(int i = 0; i < serv.length; i++) {
			Services[i] = serv[i];
		}
		
		//for loop to store location employees
		for(int i = 0; i < emp.length; i++) {
			loc_emp[i] = emp[i];
			numOfEmp++;
		}
		
		location_manager = loc_man;	//location manager
		
	}
	
	public void setLocation(String loc) {
		location = loc;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getServices() {
		//getServices is going to work like toString(), must be split on other end
		String result = "";
		for(int i = 0; i < Services.length; i++) {
			result += Services[i] + ",";
		}
		return result;
	}
	
	public String getEmployees() {
		//getEmployees is going to work like toString(), must be split on other end
		//First name and Last name will be connected with "_", must be split on other end
		//This function will only return the names of the employees
		String result = "";
		for(int i = 0; i < loc_emp.length; i++) {
			result += loc_emp[i].getFName() + "_" + loc_emp[i].getLName() + ",";
		}
		return result;
	}
	
	public employee getSpecificEmployee(String Fname) {
		/*getSpecificEmployee will return the whole employee object and must be stored
		  within another Employee object on the other end */
		
		// NOT COMPLETE //
		
		 for(int i = 0; i < loc_emp.length; i++) {
			 if(loc_emp[i].getFName() == Fname) {
				 
				 return loc_emp[i];
			 }
		 }
		
	}
	
	//finish getSpecificEmployee
	//addEmployee
	//removeEmployee
	//addServices
	//removeServices
	//assignManager
	//getNumOfEmp
	//addEquiptment
	//removeEquiptment
	//searchEquitment
	//save location information
	//load location information
	//save employee information for location
	
	
}
