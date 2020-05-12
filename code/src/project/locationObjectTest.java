package project;
import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class locationObjectTest {


	// I attempted to use BeforeClass to set up the classes before each test, but i kept running into problems
	/*
	@BeforeClass
	public static void setup() {
		String locationName = "Fremont";
		String[] serv = {"Pool", "BasketBall Court", "Sauna"};
		//String Fname, String Lname, String username, String pass
		//first name, last name, username, password
		employee emp1 = new employee("Carlos", "Vera", "username", "password", "Location-Manager");//first name, last name, username, password, position
		employee emp2 = new employee("Bob", "Soup", "SoupLover", "Soup", "Cool-Guy");
		employee emp3 = new employee("Guy", "Fieri", "FoodLover", "Taco", "Guy-That-Eats-Taco");
		employee[] arr1 = {emp1, emp2, emp3};	//we will 
		
		
		equipment eq1 = new equipment("Stationary-Bike", 1, "Available");
		equipment eq2 = new equipment("Treadmill", 2, "Available");
		equipment eq3 = new equipment("Dumbell-Set", 3, "Under-Maintainance");
		equipment[] arr2 = {eq1, eq2, eq3};
		
		String locManager = "Carlos";

		//Fremont = new location(locationName, serv, arr1, arr2, locManager);
		Fremont.
		
		 
		//System.out.println(Fremont.toString());
	}
	*/
	
	@Test
	public void testLocationConstruction() {
		location fremontLoc = new location();
		File file = new File("fremontLocation.txt");
		String FremontAbsolute = file.getAbsolutePath();
		fremontLoc.loadInformation(FremontAbsolute);

		assertEquals("Stationary-Bike_1_Available,Treadmill_2_Available,Dumbell-Set_3_Under-maintenance,", fremontLoc.getEquiptment());	//this is to test that the equipment is properly being stored

		
		assertEquals(3, fremontLoc.getNumOfEquip());	//this is to test that the equipment is properly being stored
		assertEquals(5, fremontLoc.getNumOfEmp());
		assertEquals(3, fremontLoc.getNumOfServices());
	
		System.out.println(fremontLoc.getLocationinfo());
		//assertEquals("Stationary-Bike_1_Available,Treadmill_2_Available,Dumbell-Set_3_Under-Maintainance,", Fremont.getEquiptment());
		
		System.out.println(fremontLoc.LocIsBusy());
	}

	
	@Test
	public void testAdding() {
		location fremontLoc = new location();
		File file = new File("fremontLocation.txt");
		String FremontAbsolute = file.getAbsolutePath();
		fremontLoc.loadInformation(FremontAbsolute);
		
		fremontLoc.addEquipment("Thing", 5, "Broken");
		assertEquals("Stationary-Bike_1_Available,Treadmill_2_Available,Dumbell-Set_3_Under-maintenance,Thing_5_Broken,", fremontLoc.getEquiptment());
		
		
		fremontLoc.addServices("Toilet");
		System.out.println(fremontLoc.getServices());
		assertEquals("Pool,BasketBall-Court,Sauna,Toilet," , fremontLoc.getServices());
		
	}
	
	

}
