

import java.util.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class main {
	
	
	public static void main(String arg[]) throws IOException {
		
		//in the main file we will store which user is signed in into their own variable that will
		//be passed into other functions
		//customer current_user = new customer();	we will get this information after sign-in
		
		/////////////////////////////////////////////////////////////////////////
		//this will be loading in all the information for all of the locations//
		location fremontLoc = new location();
		File file = new File("fremontLocation.txt");
		String FremontAbsolute = file.getAbsolutePath();
		fremontLoc.loadInformation(FremontAbsolute);
		
		location sanFranLoc = new location();
		File sfFile = new File("sanFranLocation");
		String SFAbsolute = sfFile.getAbsolutePath();
		sanFranLoc.loadInformation(SFAbsolute);
		
		location OaklandLoc = new location();
		File OakFile = new File("OaklandLocation.txt");
		String oakAbsolute = OakFile.getAbsolutePath();
		OaklandLoc.loadInformation(oakAbsolute);
		/////////////////////////////////////////////////////////////////////////
		
		
		
		File testFile = new File("saveTest.txt");
		String testAbso = testFile.getAbsolutePath();
		
		fremontLoc.saveinformation(testAbso);
		
		
		
		}
}
		
		
		/*
		String fn = "Carlos";
		String ln = "Vera";
		String username = "Zlos";
		String pass = "yes";
		String partition = "-----------------------------------------------";
		
		
		employee exam = new employee(fn, ln, username, pass, true);
		
		exam.getFName();
		System.out.println(exam.checkSignIn(username, pass));
		System.out.println(exam.checkSignIn(username, "no"));
		System.out.println(exam.toString());
		exam.changeManager(true);
		System.out.println(exam.toString());
		
		customer exam2 = new customer("FName", "LName", "user", "pass");
		System.out.println(exam2.checkSignIn("user", "pass"));
		System.out.println(exam2.checkSignIn("use", "pass"));	//should return false
		System.out.println(exam2.toString());
		System.out.println(exam2.fullToString());
		
		///////////////// Testing the Location Objects	///////////////////
		
		String locationName = "Fremont";
		String[] serv = {"Pool", "BasketBall Court", "Sauna"};
		//String Fname, String Lname, String username, String pass
		//first name, last name, username, password
		employee emp1 = new employee("Carlos", "Vera", "username", "password", true);//first name, last name, username, password, isHired(boolean)
		employee emp2 = new employee("Bob", "Soup", "SoupLover", "Soup", true);
		employee emp3 = new employee("Guy", "Fieri", "FoodLover", "Taco", true);
		employee[] arr1 = {emp1, emp2, emp3};	//we will 
		
		
		equiptment eq1 = new equiptment("Stationary Bike", 1, "Available");
		equiptment eq2 = new equiptment("Treadmill", 2, "Available");
		equiptment eq3 = new equiptment("Dumbell Set", 3, "Under Maintainance");
		equiptment[] arr2 = {eq1, eq2, eq3};
		
		String locManager = "Carlos";

		location Fremont = new location(locationName, serv, arr1, arr2, locManager);
		//System.out.println(Fremont.toString());
		
		///////////////////////	testing the adding/removing employee methods	/////////////////////////
		
		String[] emp = Fremont.employeeToString().split(",");	//all properties still have "_", use split("_")
		System.out.println(partition);
		System.out.println(Fremont.getNumOfEmp());
		Fremont.removeEmployeeName("FoodLover");	//we will delete people by using their usernames!
		System.out.println(Fremont.getNumOfEmp());
		
		for(int i = 0; i < Fremont.getNumOfEmp(); i++) {
			String[] temp = emp[i].split("_");
			System.out.println(partition);
			System.out.println(temp[0]);
			System.out.println(temp[1]);
			System.out.println(temp[2]);
			System.out.println(temp[3]);
			System.out.println(temp[4]);
		}
		
		System.out.println(partition);
		
		Fremont.addEmployee("Dude", "LastName", "Thing", "woot");
		String[] test2 = Fremont.employeeToString().split(",");		//all properties still have "_", use split("_")
		System.out.println(Fremont.getNumOfEmp());
		
		for(int i = 0; i < Fremont.getNumOfEmp(); i++) {
			String[] temp = test2[i].split("_");
			System.out.println(partition);
			System.out.println(temp[0]);
			System.out.println(temp[1]);
			System.out.println(temp[2]);
			System.out.println(temp[3]);
			System.out.println(temp[4]);
		}
		System.out.println(Fremont.getNumOfEmp());	//should return 3 since we deleted 1 earlier
		
		System.out.println(Fremont.getSpecificEmployee("Carlos"));	//gets information using the first name
																	//still needs to split("_")
		
		System.out.println(Fremont.getEmployees());	//testing getEmployees() methods
		System.out.println(Fremont.getNumOfEquip());
		System.out.println(Fremont.getEquiptment());
		System.out.println(Fremont.getLocationinfo());
	*/
	



	
