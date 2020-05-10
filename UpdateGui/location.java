package project;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

//import jdk.vm.ci.services.Services;
import project.Employee;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import project.location;

public class location {

	private static String[] Services = null;
	private static final String Fname = null;
	private static final String Lname = null;
	int numOfEquip;	//holds the number of equipment
	int equipmentLimit = 10;	//set to 10 for testing purposes, real applications will have larger
	int numOfEmp = 10;
	String isBusy;	//this will store whether the location is busy or not, { slow, medium, High }
	private String location;//will be generated every time the class is built
	int servicesLimit;
	String location_manager;
	Employee[] emp;
	String loc;
	String loc_man;
	String[] serv;
	int emplLimit = 10;
	int numOfServices =10;
	Equipment[] eq;
	//manager object is going to be part of the loc_emp array


	public location() {
	
		String file = "";
		//Services must be added by the fileReader, or manually by 'manager'
		int numOfServices = 0;
		String[] Services = new String[servicesLimit];
		numOfEmp = 0;
		numOfEquip = 0;
		Object[] equip = new Equipment[equipmentLimit];
		Employee[] loc_emp = new Employee[emplLimit];
	}
	public location(String loc, String serv[], Employee emp[], Equipment eq[],String loc_man) {
		location = loc;
	
		String[] Services = new String[servicesLimit];
		Equipment[] equip = new Equipment[equipmentLimit];

		location = loc;

		//for loop to store services
		System.out.println(serv.length);
		for(int i = 0; i < serv.length; i++) {
			Services[i] = serv[i];
			numOfServices++;
		}
	}
 public void findLocation(String loc, String serv[], Employee emp[], String loc_man) {
		//for loop to store location employees
		for(int i = 0; i < emp.length; i++) {
			Employee[] loc_emp = null;
			loc_emp[i] = emp[i];

			numOfEmp++;
		}

		for(int i = 0; i < eq.length; i++) {
			Equipment[] equip = null;
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
		location_manager = loc;
	}
 public String getLocation() {
	return location;
}
	public String getServices() {
		//getServices is going to work like toString(), must be split on other end
		String result = "";
		for(int i = 0; i < Services.length; i++) {
			result += Services[i] + ",";
		for(int j = 0; j < numOfServices; j++) {
			result = result + Services[j] + ",";
		}
		//return result;
	}
		return result;
}
  public String getEmployees() {
		//getEmployees is going to work like toString(), must be split on other end
		//First name and Last name will be connected with "_", must be split on other end
		//This function will only return the names of the employees
		//WILL ONLY RETURN THE FIRST, LAST, AND ID
		String result = "";
		Object[] loc_emp = null;
		for(int i = 0; i < loc_emp.length; i++) {
			result += ((Employee) loc_emp[i]).getFName() + "_" + ((Employee) loc_emp[i]).getLName() + ",";
		for(int j = 0; j < numOfEmp; j++) {
			result += ((Employee) loc_emp[i]).getFName() + "_" + ((Employee) loc_emp[i]).getLName() + "_" + ((Employee) loc_emp[i]).getUserName() + ",";
		}
		//return result;
	}
		return result;
  }
 public String getSpecificEmployee(String Fname) {	//this function is going to wo


		 //in Case it doesn't find the employee
		 System.out.println("Employee Not Found");
		 Fname = "No employee under that name";
		 return Fname;		
	}

	public void addEmployee(String Fname, String Lname, int id, Boolean isHired, Employee user) {	//this function will only be accessible with a manager
		//when the function is called, we will pass in the users information to validate that they're a manager
	}
	public String employeeToString() {	//this is going to return ALL EMPLOYEE TO STRING()

		String result = "";
		for(int i = 0; i < numOfEmp; i++) {
			Object[] loc_emp = null;
			result = result + loc_emp[i].toString() + ",";
		}
		return result;
		//return: FirstName_LastName_ID_isHired_isManager, FirstName_LastName_ID_isHired_isManager
		//therefore split with "," first to get individual employees, then split "_" to get the individual information
	}

	//public void addEmployee(String Fname, String Lname, String username, String pass)
	public void addEmployee(Employee data) {	//this function will only be accessible with a manager
		if(emplLimit == numOfEmp) {
			//int id = 0;
			System.out.println("Max limit has been reached!");
			return;
		}
		int id = 0;
		String isHired = null;
		Employee newEmp = new Employee(Fname, Lname, id, isHired, false);
		Employee[] loc_emp = null;
		loc_emp[numOfEmp] = data;
		numOfEmp++;
		return;
		
		}
public void removeEmployeeName(String user, int id) {
	if(numOfEmp == 0) {
		System.out.println("There are no employee to remove");
		return;
	}
	Object[] loc_emp = null;
	if(((Employee) loc_emp[numOfEmp - 1]).getId() ==id){
		if(((Employee) loc_emp[numOfEmp - 1]).getUserName().equals(user)) {
			numOfEmp--;
			return;
		}
	}
	for(int i = 0; i < numOfEmp -1; i++) {
		if(((Employee) loc_emp[i]).getId() == id) {
			for(int j = i; j < numOfEmp -1; j++) {
				if(((Employee) loc_emp[j]).getUserName().equals(user)) {
					for(int k = i; k < numOfEmp - 1; k++) {
						loc_emp[k] = loc_emp[k + 1];
					}
				}
			}
			numOfEmp--;
		}
	}
	if(numOfServices == 0) {
		System.out.println("This location has no employees");
	}
}
 public void addServices(String service) {

		Services[numOfServices] = service;
		numOfServices++;

		if(numOfServices == servicesLimit) {
			System.out.println("Services are now full!");
		}
		return;
		
		}

	public void removeServices(String service) {	//we will check if user is a manage
	
	}
	//we will use the id to find the employee to assign manager
	public void assignManager(String user,int id) {	//we will use the id to find the employee to assign manager
		for(int i = 0; i < numOfEmp - 1; i++) {
			Object[] loc_emp = null;
			Object[] isManager;
			if(((Employee) loc_emp[i]).getId() == id) {
			if(((Employee) loc_emp[i]).getUserName().equals(user)) {
				((Employee) loc_emp[i]).changeManager(true);
				System.out.println(((Employee) loc_emp[i]).getFName() + " Has been assigned manager: ");
				return;
				 //((Object) loc_emp[i]).isManager()
			}
			}
		}
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
		if(numOfEquip == equipmentLimit) {
			System.out.println("The limit for equipment has been reached");
			return;
		}

		Equipment newEquipt = new Equipment(name, code, status);
		Equipment[] equip = null;
		equip[numOfEquip] = newEquipt;
		System.out.println("Number of Equip: " + numOfEquip);
		Equipment newEquip = new Equipment(name, code, status);
		System.out.println(newEquip.toString());
		equip[numOfEquip] = newEquip;
		numOfEquip++;
		System.out.println(name + " was added to the equipment");
		return;
	}
}
		public void removeEquipment(String name) {

		for(int i = 0; i < numOfEquip - 1; i++) {	//iterate through the list to find the service
			if(eq[i].getName().equals(name)) {
				for(int j = i; i < numOfEquip - 1; j++) {
				for(int k = i; k < numOfEquip - 1; k++) {
					eq[j] = eq[j+1];	//this is going to skip over the element within the array
				}
				numOfEquip--;
				}
			}
		}
	}
       public String searchEquipment(String name) {	//this function will act like a toS
		return Fname;
	}

	public String getEquiptment() {	//this function will work like a toString() function, use .split(",")
		String result = "";
		for(int i = 0; i < numOfEquip; i++) {
			Object[] equip = null;
			result = result + equip[i].toString() + ",";	//this will return: Name_Code_Status, Name_Code_Status
		}
		return result;
	}

	//save location information
	//load location information
	//save employee information for location
	public String getLocationinfo() {	//returns: Location name, Location manager, IsBusy, equipment toString(), service toString()
		String result = "";
		Object[] equip = null;
		result = getLocation() + "," + location_manager + "," + isBusy + ",";
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

	public void loadInformation(String file) {


		String partition = "\n--------------------------------------------------\n";
		System.out.println(file);

		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;	//this will read the line of data in the text file
			int count = 0;	//this is to keep track of where we are at in the file
			//1st line: Location name.
			//2nd line: Location manager
			//3rd: Services
			//4th: Equiptment
			//5th: Maybe Employees
			//br.readLine();
			while((line = br.readLine()) != null) {
				switch(count) {
					case 0:	//loading in the location name
						System.out.println(partition);
						System.out.println("Case :" + count + ", loading the location name");
						location_manager = line;	//no split, sets location name into class
						System.out.println(location);
						count++;
						break;
					case 1:	//loading in the Locatino manager
						System.out.println(partition);
						System.out.println("Case :" + count + ", Loading in the location manager");
						location_manager = line;
						System.out.println(location_manager);
						count++;
						break;
					case 2:	//loading in the Services 
						System.out.println(partition);
						System.out.println("Case :" + count + ", Loading in the Services");
						System.out.println(line);
						String unSplit = line;
						//String[] data = unSplit.split(",");

						Services = unSplit.split(",");

						for(int i = 0; i < Services.length; i++) {
							System.out.println(Services[i]);
						}
						//System.out.println(Services.length);
						numOfServices = Services.length;	//sets the classes number of services
						System.out.println("Total Number of Services added: " + numOfServices);
						count++;
						break;
					case 3:	//loading in the equipment
						System.out.println(partition);
						System.out.println("Case: " + count + ", Loading in the Equipment");
						System.out.println(line);
						unSplit = line;	//reusing variable
						String[] unSplitEqui = unSplit.split(",");
						for(int i = 0; i < unSplitEqui.length; i++) {
							String[] split = unSplitEqui[i].split("_");
							//equiptment only has three properties, so 3 elements
							int code = Integer.parseInt(split[1]);
							//System.out.println(Integer.parseInt(split[1]));
							//System.out.println(code);
							addEquipment(split[0], code, split[2]);	//split[1] is String, we convert to int for code
						}
						System.out.println(getEquiptment());
						System.out.println("Total Number of Equipment added: " + numOfEquip);
						count++;
						break;
					case 4:	//loading in the employees
						System.out.println(partition);
						System.out.println("Case: " + count + ", Loading in the Location Employees");

						unSplit = line;
						String[] unSplitEmp = unSplit.split(",");
						for(int i = 0; i < unSplitEmp.length; i++) {
							String[] split = unSplitEmp[i].split("_");
							Employee temp = new Employee(split[0], split[1], split[2], split[3], split[4], split[5], Boolean.parseBoolean(split[6]));
							System.out.println(split[0] + " " + split[1] + " " + split[2] + " " + split[3] + " " + split[4] + " " + split[5] + " " + Boolean.parseBoolean(split[6]));
							addEmployee(temp);
						}
						//System.out.println(employeeToString());
						System.out.println("Total Number of Employees added: " + numOfEmp);
						count++;
						break;
					case 5:
						br.close();	//reliquishes resources
						break;
					default:
						System.out.println("DEFAULT CASE");

				}

			}
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

	public void saveinformation(String file) {

		System.out.println(file);
		try {
			Formatter x = new Formatter(file);
			System.out.println(getLocation());
			x.format("%s", getLocation());
			x.format("%s", "thing");


		} catch(Exception e) {
			System.out.println("ERROR OCCURED");
			e.printStackTrace();
		}



	}
				}