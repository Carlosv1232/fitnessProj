
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class location {

	String location;	//stores the name of the location
	
	String[] Services;	//this will contain everything that each location offers
	int numOfServices;
	int servicesLimit = 5;
	
	employee[] loc_emp;	//array to hold the location employees
	int numOfEmp;	//number of employees at the location
	int emplLimit = 10;	//each location will be limited by 10 employees including the manager
		
	equiptment[] equip;	//holds all the equipment that the location has
	int numOfEquip;	//holds the number of equipment
	int equipmentLimit = 10;	//set to 10 for testing purposes, real applications will have larger
	
	String isBusy;	//this will store whether the location is busy or not, { slow, medium, High }
					//will be generated every time the class is built
	
	String location_manager;	//manager object is going to be part of the loc_emp array
	
	
	public location() {
		location = "";
		//Services must be added by the fileReader, or manually by 'manager'
	}
	
	public location(String loc, String serv[], employee emp[], equiptment eq[],String loc_man) {
		String[] Services = new String[servicesLimit];
		loc_emp = new employee[emplLimit];
		equiptment[] equip = new equiptment[equipmentLimit];
		
		location = loc;
		
		//for loop to store services
		System.out.println(serv.length);
		for(int i = 0; i < serv.length; i++) {
			Services[i] = serv[i];
			numOfServices++;
		}
		
		//for loop to store location employees
		for(int i = 0; i < emp.length; i++) {
			loc_emp[i] = emp[i];
		
			numOfEmp++;
		}
		
		for(int i = 0; i < eq.length; i++) {
			equip[i] = eq[i];
			numOfEquip++;
		}
		
		location_manager = loc_man;	//location manager
		
		int ranNum = ThreadLocalRandom.current().nextInt(1, 4);	//will generate a number between 1 - 3
		if(ranNum == 1) {
			isBusy = "Slow";
		} else if(ranNum == 2) {
			isBusy = "Medium";
		} else if(ranNum == 3) {
			isBusy = "High";
		}
		
		
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
		for(int i = 0; i < numOfServices; i++) {
			result = result + Services[i] + ",";
		}
		return result;
	}
	
	public String getEmployees() {
		//getEmployees is going to work like toString(), must be split on other end
		//First name and Last name will be connected with "_", must be split on other end
		//This function will only return the names of the employees
		//WILL ONLY RETURN THE FIRST, LAST, AND ID
		String result = "";
		for(int i = 0; i < numOfEmp; i++) {
			result += loc_emp[i].getFName() + "_" + loc_emp[i].getLName() + "_" + loc_emp[i].getUser() + ",";
		}
		return result;
	}
	
	public String getSpecificEmployee(String Fname) {	//this function is going to work like toString()
		
		String result = "";
		
		 for(int i = 0; i < loc_emp.length; i++) {
			 if(loc_emp[i].getFName() == Fname) {
				 result = loc_emp[i].toString();	//is going to return, first name, Last name, ID, and the isHired status
				 return result;	// 
			 }
		 }
		 
		 
		 //in Case it doesn't find the employee
		 System.out.println("Employee Not Found");
		 result = "No employee under that name";
		 return result;		
	}
	
	public String employeeToString() {	//this is going to return ALL EMPLOYEE TO STRING()
		
		String result = "";
		for(int i = 0; i < numOfEmp; i++) {
			result = result + loc_emp[i].toString() + ",";
		}
		return result;
		//return: FirstName_LastName_ID_isHired_isManager, FirstName_LastName_ID_isHired_isManager
		//therefore split with "," first to get individual employees, then split "_" to get the individual information
	}
	
	public void addEmployee(String Fname, String Lname, String username, String pass) {	//this function will only be accessible with a manager
		//when the function is called, we will pass in the users information to validate that they're a manager
		/*
		if(user.returnManager() == false) {	//if the user is not an manager, then they will be returned to the menu
			System.out.println("You dont have proper credentials");
			return;
		}
		*/
		
		if(emplLimit == numOfEmp) {	//checks limit of employees for the location
			System.out.println("Maximum limit has been reached!");
			return;
		}
		
		employee newEmp = new employee(Fname, Lname, username, pass, true);	//isManager is set to false by default
		
		
		loc_emp[numOfEmp] = newEmp;	//employee is set to the end of the list
		numOfEmp++;	//increment number of employees at the location
		
		return;
		
	}
	
	public void removeEmployeeName(String user) {	//function will need to take the User name of the employee in order to avoid people with same first and last names
		if(numOfEmp == 0) {
			System.out.println("There are no employees to remove");
			return;
		}
		if(loc_emp[numOfEmp - 1].getUser().equals(user)) {	//checks if the employee is the last one in the list
			numOfEmp--;
			return;
		}
		//System.out.println("Inside the function: " + numOfEmp);
		
		for(int i = 0; i < numOfEmp - 1; i++) {	//iterate through the list to find the employee
			//System.out.println(loc_emp.toString());
			if(loc_emp[i].getUser().equals(user)) {
				for(int j = i; j < numOfEmp - 1; j++) {
					loc_emp[j] = loc_emp[j+1];	//this is going to skip over the element within the array
				}
				numOfEmp--;
			}
		}
		
		
		
		
		if(numOfEmp == 0) {
			System.out.println("This Location no longer has employees");
		}
		return;
		
	}
	
	public void addServices(String service) {	
	//services and equiptment are different things in this case
	//services could apply to swimming pool, sauna, basketball court, personal training
		if(servicesLimit == numOfServices) {	//checks the limit of services
			System.out.println("The limit of services has been reached");
			return;
		}
		
		Services[numOfServices] = service;
		numOfServices++;
		
		if(numOfServices == servicesLimit) {
			System.out.println("Services are now full!");
		}
		return;
	}
	
	public void removeServices(String service) {	//we will check if user is a manager from the GUI
		
		if(numOfServices == 0) {
			System.out.println("There are no Services to remove");
			return;
		}
		if(Services[numOfServices - 1] == service) {	//checks if the service is the last one in the list
			numOfServices--;
			return;
		}
		
		for(int i = 0; i < numOfServices - 1; i++) {	//iterate through the list to find the service
			if(Services[i] == service) {
				for(int j = i; i < numOfServices - 1; j++) {
					Services[j] = Services[j+1];	//this is going to skip over the element within the array
				}
				numOfServices--;
			}
		}
		
		if(numOfServices == 0) {
			System.out.println("This Location no longer has Services");
		}
		return;
		
	}
	
	public void assignManager(String user) {	//we will use the id to find the employee to assign manager
		for(int i = 0; i < numOfEmp - 1; i++) {
			if(loc_emp[i].getUser().equals(user)) {
				loc_emp[i].changeManager(true);
				System.out.println(loc_emp[i].getFName() + " Has been assigned manager: " + loc_emp[i].isManager);
				return;
			}
		}
		
		System.out.println("Could not find employee");
		return;
	}
	
	public int getNumOfEmp() {	//returns the number of employees
		return numOfEmp;
	}
	
	public int getNumOfEquip() {
		return numOfEquip;
	}
	
	public void addEquipment(String name, int code, String status) {	//the user will have to enter in the equiptment information
	//we will check if user is manager within the GUI
		if(equipmentLimit == 10) {
			System.out.println("The limit for equipment has been reached");
			return;
		}
		
		equiptment newEquipt = new equiptment(name, code, status);
		equip[numOfEquip] = newEquipt;
		System.out.println(name + " was added to the equipment");
		return;
	}
	
	public void removeEquipment(String name) {
		if(numOfEquip == 0) {
			System.out.println("There are no equipment to remove");
			return;
		}
		if(equip[numOfEquip - 1].getName().equals(name)) {	//checks if the equipment is the last one in the list
			numOfEquip--;
			return;
		}
		
		for(int i = 0; i < numOfEquip - 1; i++) {	//iterate through the list to find the service
			if(equip[i].getName().equals(name)) {
				for(int j = i; j < numOfEquip - 1; j++) {
					equip[j] = equip[j+1];	//this is going to skip over the element within the array
				}
				numOfEquip--;
			}
		}
		
		if(numOfEquip == 0) {
			System.out.println("This Location no longer has equipment");
		}
		return;
	}
	
	public String searchEquipment(String name) {	//this function will act like a toString()
		String result = "";
		for(int i = 0; i < numOfEquip - 1; i++) {
			if(equip[i].getName().equals(name)) {
				result = equip[i].getName() + "," + equip[i].getCode() + "," + equip[i].getStatus();
				return result;
			}
		}
		
		result = "Equipment was not found";
		System.out.println("Equipment was not found");
		return result;
	}
	
	public String getEquiptment() {	//this function will work like a toString() function, use .split(",")
		String result = "";
		for(int i = 0; i < numOfEquip; i++) {
			result = result + equip[i].toString() + ",";	//this will return: Name_Code_Status, Name_Code_Status
		}
		return result;
	}
	
	public String getLocationinfo() {	//returns: Location name, Location manager, IsBusy, equipment toString(), service toString()
		String result = "";
		result = location + "," + location_manager + "," + isBusy + ",";
		for(int i = 0; i < numOfEquip; i++) {
			result = result + equip[i].toString() + ",";
		}
		for(int i = 0; i < numOfServices; i++) {
			result = result + Services[i] + ",";
		}
		return result;
	}
	
	/*
	String location;	//stores the name of the location
	
	String[] Services;	//this will contain everything that each location offers
	int numOfServices;
	int servicesLimit = 5;
	
	employee[] loc_emp;	//array to hold the location employees
	int numOfEmp;	//number of employees at the location
	int emplLimit = 10;	//each location will be limited by 10 employees including the manager
		
	equiptment[] equip;	//holds all the equipment that the location has
	int numOfEquip;	//holds the number of equipment
	int equipmentLimit = 10;	//set to 10 for testing purposes, real applications will have larger
	
	String isBusy;	//this will store whether the location is busy or not, { slow, medium, High }
					//will be generated every time the class is built
	
	String location_manager;	//manager object is going to be part of the loc_emp array
	*/
	
	public void loadInformation() {
	/* These are just suggestions, you could build it however you think is correct!
	 * 
	 * We need this function to load all the information that the location needs
	 * 
	 * we can seperate the location information into seperate .txt files such as:
	 * fremont.txt, hayward.txt, unioncity.txt and each of the txt files will contain the information for this location
	 * 
	 * if you want we could have a seperate txt file for saving the employees information such as: fremontEmpl.txt, haywardEmpl.txt
	 * 
	 * make sure that the information within the txt file is structured so that the data being read may be stored correctly for example
	 * each line in the txt file contains the information for each variable in the class like: location name, services, equiptment, etc.
	 * 
	 * use the class functions to store the information into the class itself
	 * 
	 * 
	 * 
	 */
			
	}
	
	public void saveinformation() {
		/*	for saving the information into the txt file make sure that the file maintains the same 
		 * structure so that when we reload the information into the classes, there won't be information getting in somewhere else
		 * 
		 * use the get functions to return the information in here to get stored into the txt file
		 * remember that some of the get functions will work like toString() so you will need to
		 * use the .split() in order to split up the information
		 * the functions that work like toString() will be labeled by the function itself
		 * 
		 * change up the process if you find it easier, make sure to test the functions!
		 * if there are any functions that aren't properly working, please let Carlos know, or if you
		 * know how to fix it, please do so. Thank you
		 * 
		 * toString functions to use to get the data:
		 * 
		 * employeeToString() return val: return: FirstName_LastName_ID_isHired_isManager, FirstName_LastName_ID_isHired_isManager
		 * to split: split using "," to get each persons toString(), then split with "_" to seperate the names, id, isHired, and isManager
		 * note: isHired, and isManager are boolean variables so you might have trouble storing it on the text file, if thats the case, 
		 * change the variable to 
		 * 
		 */
	}
	
	//save location information
	//load location information
	//save employee information for location
	
	
}
