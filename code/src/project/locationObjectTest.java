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
		Employee emp1 = new Employee("Carlos", "Vera", "username", "password", "Location-Manager");//first name, last name, username, password, position
		Employee emp2 = new Employee("Bob", "Soup", "SoupLover", "Soup", "Cool-Guy");
		Employee emp3 = new Employee("Guy", "Fieri", "FoodLover", "Taco", "Guy-That-Eats-Taco");
		Employee[] arr1 = {emp1, emp2, emp3};	//we will 
		
		
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

		assertEquals("Stationary-Bike_1_Available,Treadmill_2_Available,Dumbell-Set_3_Under-maintenance,", fremontLoc.getEquipment());	//this is to test that the equipment is properly being stored

		
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
		assertEquals("Stationary-Bike_1_Available,Treadmill_2_Available,Dumbell-Set_3_Under-maintenance,Thing_5_Broken,", fremontLoc.getEquipment());
		
		
		fremontLoc.addServices("Toilet");
		System.out.println(fremontLoc.getServices());
		assertEquals("Pool,BasketBall-Court,Sauna,Toilet," , fremontLoc.getServices());
		
		Employee emp3 = new Employee("Guy", "Fieri", "FoodLover", "Taco", "Guy-That-Eats-Taco");
		fremontLoc.addEmployee(emp3);	//when adding an Employee, the constructor will store in the date, and assign isManager to false
		//Employee information to be added to the list: Guy_Fieri_FoodLover_Taco_Guy-That-Eats-Taco_05-11-2020_false,
		assertEquals("Carlos_Vera_user123_pass123_Manager_04-02-2020_true,Manuel_Forbes_we9874_pass987_Trainer_05-20-2019_false,Mabel_Kelley_df6543_pass456_Maintainence_01-02-2015_false,Richard_Cake_hg1245_pass159_Front-Desk_04-20-2020_false,Jawad_Burt_ea8566_pass147_Sanitation_02-06-2077_false,Guy_Fieri_FoodLover_Taco_Guy-That-Eats-Taco_05-12-2020_false,", fremontLoc.EmployeeFullToString());
	}
	
	@Test
	public void testRemove() {
		location fremontLoc = new location();
		File file = new File("fremontLocation.txt");
		String FremontAbsolute = file.getAbsolutePath();
		fremontLoc.loadInformation(FremontAbsolute);
		
		fremontLoc.removeEquipment("Stationary-Bike");
		assertEquals("Treadmill_2_Available,Dumbell-Set_3_Under-maintenance,", fremontLoc.getEquipment());
		fremontLoc.removeEquipment("Treadmill");
		assertEquals("Dumbell-Set_3_Under-maintenance,", fremontLoc.getEquipment());
		fremontLoc.removeEquipment("Dumbell-Set");
		assertEquals("", fremontLoc.getEquipment());
		//removed all equipment for testing
		
		fremontLoc.removeServices("Pool");
		assertEquals("BasketBall-Court,Sauna,", fremontLoc.getServices());
		fremontLoc.removeServices("Sauna");
		assertEquals("BasketBall-Court,", fremontLoc.getServices());
		fremontLoc.removeServices("BasketBall-Court");
		assertEquals("", fremontLoc.getServices());
		
		fremontLoc.removeEmployeeName("user123");	//removing Carlos Vera, the first Employee on the list
		assertEquals("Manuel_Forbes_we9874_pass987_Trainer_05-20-2019_false,Mabel_Kelley_df6543_pass456_Maintainence_01-02-2015_false,Richard_Cake_hg1245_pass159_Front-Desk_04-20-2020_false,Jawad_Burt_ea8566_pass147_Sanitation_02-06-2077_false,", fremontLoc.EmployeeFullToString());
		
		
		
	}
	
	

}
