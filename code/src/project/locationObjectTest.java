package project;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class locationObjectTest {


	
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

		location Fremont = new location(locationName, serv, arr1, arr2, locManager);
		//System.out.println(Fremont.toString());
	}
	
	
	@Test
	public void testLocation() {
		System.out.println("");
		assertEquals("Stationary-Bike_1_Available,Treadmill_2_Available,Dumbell-Set_3_Under-Maintenance,", Fremont.getEquipment());	//this is to test that the equipment is properly being stored
		
	}

	

}
