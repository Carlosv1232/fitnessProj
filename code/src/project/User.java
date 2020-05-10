package project;

import java.io.*;

//this will serve as the base class for the employee and the customer//
public class User {
	
	private String first_name;
	private String last_name;
	private String Username;
	private String password;
	
	public User() {
		first_name = "";
		last_name = "";
		Username = "";
		password = "";
	}
	public User(String fn, String ln, String u, String pass) {
		first_name = fn;
		last_name = ln;
		Username = u;
		password = pass;
	}
	public void setfName(String fn) {
		first_name = fn;
	}
	public void setlName(String ln) {
		last_name = ln;
	}
	public void setUser(String user) {
		Username = user;
	}
	public String getFName() {
		return first_name;
	}
	public String getLName() {
		return last_name;
	}
	public String getUser() {
		return Username;
	}
	public String getPass() {
		return password;
	}
	
	public boolean checkSignIn(String user, String pass) {
		if(Username.equals(user) && password.equals(pass)) {
			System.out.println("Successful Login!");
			return true;
		}
		
		System.out.println("Username/password incorrect");
		return false;	//if the username and password don't match return false
	}
	
	public String toString() {	//this toString() will return everything BUT NOT the password
	//when split: arr[0]: Fname, arr[1]: Lname, arr[2]: id
		String result = first_name + "_" + last_name + "_" + Username;
		return result;
	}
	
	public String allInfo() {//this is going to be used for storing the users data in the text file
		//fullToString() will return everything INCLUDING the password
	
		String result = first_name + "_" + last_name + "_" + Username + "_" + password;
		return result;
	}
}
