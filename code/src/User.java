
import java.io.*;

//this will serve as the base class for the employee and the customer//
public class User {
	
	private String first_name;
	private String last_name;
	private int id;
	
	public User() {
		first_name = "";
		last_name = "";
		id = 0;
	}
	public User(String fn, String ln, int i) {
		first_name = fn;
		last_name = ln;
		id = i;
	}
	public void setfName(String fn) {
		first_name = fn;
	}
	public void setlName(String ln) {
		last_name = ln;
	}
	public void setId(int i) {
		id = i;
	}
	public String getFName() {
		return first_name;
	}
	public String getLName() {
		return last_name;
	}
	public int getId() {
		return id;
	}
	public String toString() {
	//when split: arr[0]: Fname, arr[1]: Lname, arr[2]: id
		String result = first_name + "," + last_name + "," + id;
		return result;
	}
	
}
