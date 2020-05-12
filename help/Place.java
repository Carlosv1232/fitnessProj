package project;

public class Place<Equipment> {
String location;	//stores the name of the location
	
	String[] Services;	//this will contain everything that each location offers
	int numOfServices;
	int servicesLimit = 5;
	
	Employee[] loc_emp;	//array to hold the location employees
	int numOfEmp;	//number of employees at the location
	int emplLimit = 10;	//each location will be limited by 10 employees including the manager
		
	Equipment[] equip;	//holds all the equipment that the location has
	int numOfEquip;	//holds the number of equipment
	int equipmentLimit = 10;	//set to 10 for testing purposes, real applications will have larger
	
	String location_manager;	//manager object is going to be part of the loc_emp array
	
	
	public Place() {
		location = "";
		//Services must be added by the fileReader, or manually by 'manager'
	}
	
	public Place(String loc, String serv[], Employee emp[], String loc_man) {
		location = loc;
		loc_emp = new Employee[emplLimit];
		//for loop to store services
		for(int i = 0; i < serv.length; i++) {
			Services[i] = serv[i];
			numOfServices++;
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
	
	public String getSpecificEmployee(String Fname) {	//this function is going to work like toString()
		
		String result = "";
		
		 for(int i = 0; i < loc_emp.length; i++) {
			 if(loc_emp[i].getFName() == Fname) {
				 result = loc_emp[i].toString();	//is going to return, first name, Last name, ID, and the isHired status
				 return result;	// 
			 }
		 }
		 
		 
		 //in Case it doesn't find the employee
		 result = "No employee under that name";
		 return result;		
	}
	
	public void addEmployee(String Fname, String Lname, int id, Boolean isHired, Employee user) {	//this function will only be accessible with a manager
		//when the function is called, we will pass in the users information to validate that they're a manager
		
		if(user.returnManager() == false) {	//if the user is not an manager, then they will be returned to the menu
			return;
		}
		
		if(emplLimit == numOfEmp) {	//checks limit of employees for the location
			System.out.println("Maximum limit has been reached!");
			return;
		}
		
		Employee newEmp = new Employee(Fname, Lname, id, Lname, isHired);	//isManager is set to false by default
		loc_emp[numOfEmp] = newEmp;	//employee is set to the end of the list
		numOfEmp++;	//increment number of employees at the location
		return;
		
	}
	
	public void removeEmployeeName(int id) {	//function will need to take the id of the employee in order to avoid people with first and last names
		if(numOfEmp == 0) {
			System.out.println("There are no employees to remove");
			return;
		}
		if(loc_emp[numOfEmp - 1].getId() == id) {	//checks if the employee is the last one in the list
			numOfEmp--;
			return;
		}
		
		for(int i = 0; i < numOfEmp - 1; i++) {	//iterate through the list to find the employee
			if(loc_emp[i].getId() == id) {
				for(int j = i; i < numOfEmp - 1; j++) {
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
	
	public void assignManager(int id) {	//we will use the id to find the employee to assign manager
		for(int i = 0; i < numOfEmp - 1; i++) {
			if(loc_emp[i].getId() == id) {
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
	
	public void addEquipment(String name, int code, String status) {	//the user will have to enter in the equiptment information
	//we will check if user is manager within the GUI
		Object[] equip;
		if(equipmentLimit == 10) {
			System.out.println("The limit for equipment has been reached");
			return;
		}
		
		Equipment newEquipt = new Equipment(name, code, status);
		equip[numOfEquip] = newEquipt;
		System.out.println(name + " was added to the equipment");
		return;
	}
	
	public void removeEquipment(String name) {
		if(numOfEquip == 0) {
			System.out.println("There are no equipment to remove");
			return;
		}
		if(((Object) equip[numOfEquip - 1]).getName().equals(name)) {	//checks if the equipment is the last one in the list
			numOfEquip--;
			return;
		}
		
		for(int i = 0; i < numOfEquip - 1; i++) {	//iterate through the list to find the service
			if(((Object) equip[i]).getName().equals(name)) {
				for(int j = i; i < numOfEquip - 1; j++) {
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


	
	
	//save location information
	//load location information
	//save employee information for location
	

}