package project;
import static org.junit.Assert.*;

import org.junit.Test;

public class employeeAndCustomerTest {

	@Test
	public void dateJoinedTest() {
		//This is just testing if the date returns correct when constructor is called
		employee test = new employee("Carlos", "Vera", "Username", "Password", "Snack-Quality-Control");
		System.out.println("Date Joined: " + test.returnDate());
		System.out.println(test.returnDate());
		assertEquals("05-11-2020", test.returnDate());	//the expected value must be updated the day it was run
	}

	@Test
	public void testValidLogin() {
		//login function is part of the User class which employee and customer inherits from!
		employee test = new employee("Carlos", "Vera", "Username", "Password", "Snack-Quality-Control");
		customer test2 = new customer("NotCarlos", "NotVera", "NotUsername", "NotPassword");
		
		assertEquals(true , test.checkSignIn("Username", "Password"));
		assertEquals(true, test2.checkSignIn("NotUsername", "NotPassword"));
		
	}
	
	@Test
	public void testBadPasswordLogin() {
		employee test = new employee("Carlos", "Vera", "Username", "Password", "Snack-Quality-Control");
		customer test2 = new customer("NotCarlos", "NotVera", "NotUsername", "NotPassword");
		
		
		assertEquals(false , test.checkSignIn("Username", "IThinkThisIsThePass"));
		assertEquals(false, test2.checkSignIn("NotUsername", "WhatsAPassword"));
		
	}
	
	@Test
	public void testBassUsernameLogin() {
		employee test = new employee("Carlos", "Vera", "Username", "Password", "Snack-Quality-Control");
		customer test2 = new customer("NotCarlos", "NotVera", "NotUsername", "NotPassword");
		
		assertEquals(false , test.checkSignIn("Pancakes", "Password"));
		assertEquals(false, test2.checkSignIn("what", "NotPassword"));
		
	}
	
	@Test
	public void testChangePosition() {
		employee test = new employee("Carlos", "Vera", "Username", "Password", "Snack-Quality-Control");
		assertEquals("Snack-Quality-Control", test.returnPosition());
		test.changePosition("Sweat-Manager");
		assertEquals("Sweat-Manager", test.returnPosition());
		
	}

}
