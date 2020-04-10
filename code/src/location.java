
import java.util.*;

public class location {

	String location;
	String[] Services;	//this will contain everything that each location offers
	employee[] loc_emp;	//array to hold the location employees
	String location_manager;
	
	public location() {
		location = "";
		//Services must be added by the fileReader, or manually by 'manager'
	}
	
	public location(String loc, String serv[]) {
		location = loc;
		for(int i = 0; i < serv.length; i++) {
			Services[i] = serv[i];
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
		for(int i = 0; i < Services.length; i++) {
			result += Services[i] + ",";
		}
		return result;
	}
	
	
}
