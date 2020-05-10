package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;


public class location {

	String location;	//stores the name of the location
	
	String[] Services;	//this will contain everything that each location offers
	int numOfServices;
	int servicesLimit = 5;
	
	employee[] loc_emp;	//array to hold the location employees
	int numOfEmp;	//number of employees at the location
	int emplLimit = 15;	//each location will be limited by 10 employees including the manager
		
	equiptment[] equip;	//holds all the equipment that the location has
	int numOfEquip;	//holds the number of equipment
	int equipmentLimit = 10;	//set to 10 for testing purposes, real applications will have larger
	
	String isBusy;	//this will store whether the location is busy or not, { slow, medium, High }
					//will be generated every time the class is built
	
	String location_manager;	//manager object is going to be part of the loc_emp array
	
	
	public location() {
		location = "";
		//Services must be added by the fileReader, or manually by 'manager'
		numOfServices = 0;
		numOfEmp = 0;
		numOfEquip = 0;
		equip = new equiptment[equipmentLimit];
		loc_emp = new employee[emplLimit];
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
	
	public String getLocationManager() {
		return location_manager;
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
			 if(loc_emp[i].getFName().equals(Fname)) {	//loc_emp[i].getFName() == Fname
				 result = loc_emp[i].toString();	//is going to return, first name, Last name, ID, and the isHired status
				 return result;	// 
			 }
		 }
		 
		 
		 //in Case it doesn't find the employee
		 System.out.println("Employee Not Found");
		 result = "No employee under that name";
		 return result;		
	}
	
	public String employeeToString() {	
		
		String result = "";
		for(int i = 0; i < numOfEmp; i++) {
			result = result + loc_emp[i].toString() + ",";
		}
		return result;
		//return: FirstName_LastName_ID_isHired_isManager, FirstName_LastName_ID_isHired_isManager
		//therefore split with "," first to get individual employees, then split "_" to get the individual information
	}
	
	public String employeeFullToString() {	//this will be used to store the data back to the text file
		String result = "";
		for(int i = 0; i < numOfEmp; i++) {
			result = result + loc_emp[i].fullToString() + ",";
		}
		return result;
	}
	
	//public void addEmployee(String Fname, String Lname, String username, String pass)
	public void addEmployee(employee data) {	//this function will only be accessible with a manager
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
		
		
		loc_emp[numOfEmp] = data;	//employee is set to the end of the list
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
		if(numOfEquip == equipmentLimit) {
			System.out.println("The limit for equipment has been reached");
			return;
		}
		System.out.println("Number of Equip: " + numOfEquip);
		equiptment newEquip = new equiptment(name, code, status);
		System.out.println(newEquip.toString());
		equip[numOfEquip] = newEquip;
		numOfEquip++;
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
		System.out.println(result);
		return result;
	}
	
	public String getLocationinfo() {	//returns: Location name, Location manager, IsBusy, equipment toString(), service toString()
		String result = "";
		result = location + "," + location_manager + ",";
		for(int i = 0; i < numOfServices; i++) {
			result = result + Services[i] + ",";
		}
		for(int i = 0; i < numOfEquip; i++) {
			result = result + equip[i].toString() + ",";
		}
		return result;
	}
	
	public String returnStatus(String r) {
		String result = "";
		for(int i = 0; i < numOfEquip; i++) {
			if(equip[i].getName().equals(r)) {
				result = equip[i].getName() + ": " + equip[i].getStatus();
			}
		}
		return result;
	}
	
	public String LocIsBusy() {
		String result = getLocation() + ": " + isBusy;
		return result;
	}
	
	public void loadInformation(String file) {
		//	function notes:
		//this function will load the information line by line, I will do this by using switch case
		//each case will represent one line in the text file
		//the text file has been structured so that each line has different data to be read in
		//I used a counter to track which line will be read next, it will continue reading until null
		
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
						location = line;	//no split, sets location name into class
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
							System.out.println(split.length);
							employee temp = new employee(split[0], split[1], split[2], split[3], split[4], split[5], Boolean.parseBoolean(split[6]));
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
	
	public void saveinformation(String file) throws IOException {
		
		String partition = "----------------------------------";
		System.out.println(file);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.flush();
			
			String info = getLocationinfo();
			String[] unSplit = info.split(",");
			
			int counter = 0;	//this will be used to keep track of the information in the unSplit array
			
			System.out.println(partition);
			System.out.println("Storing the location Name");
			bw.write(unSplit[0]);	//stores the location name
			bw.newLine();
			counter++;
			System.out.println("Counter: " + counter);
			
			
			System.out.println(partition);
			System.out.println("Storing the location manager");
			bw.write(unSplit[1]);	//stores the Location Manager
			bw.newLine();
			counter++;
			System.out.println("Counter: " + counter);
			
			String storeServ = "";
			int counterClone = counter;	//counterClone is created to not mess up the for loop and incrementing counter
			for(int i = counterClone; i < (numOfServices + counterClone); i++) {
				storeServ = storeServ + unSplit[i] + ",";
				//System.out.println(unSplit[i]);
				counter++;
			}
			
			System.out.println(partition);
			System.out.println("Storing the Services");
			bw.write(storeServ);//stores the locations services
			bw.newLine();
			System.out.println("Number of Services: " + numOfServices);
			System.out.println("Counter: " + counter);
			
			String storeEqui = "";
			counterClone = counter;
			for(int i = counterClone; i < (numOfEquip + counterClone); i++) {
				storeEqui = storeEqui + unSplit[i] + ",";
				counter++;
			}
			
			System.out.println(partition);
			System.out.println("Storing in Equipment");
			bw.write(storeEqui);
			bw.newLine();
			System.out.println("Number of Equipment: " + numOfEquip);
			System.out.println("Counter: " + counter);
			
			System.out.println(partition);
			System.out.println("Storing the Employee information");
			System.out.println("Number of Employees: " + numOfEmp);
			bw.write(employeeFullToString());
			
			bw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("Done Saving!");
	
	
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
	
	
}