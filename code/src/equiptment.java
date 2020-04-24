import java.util.*;

public class equiptment {	//I know its spelled wrong!
	String name;
	int code;
	String status;
	
	public equiptment() {
		name = "";
		code = 0;
		status = "";
	}
	public equiptment(String n, int c, String s) {
		name = n;
		code = c;
		status = s;
	}
	public void setName(String n) {
		name = n;
	}
	public void setCode(int c) {
		code = c;
	}
	public void setStatus(String s) {
		status = s;
	}
	public String getName() {
		return name;
	}
	public int getCode() {
		return code;
	}
	public String getStatus() {
		return status;
	}
	public String toString() {
		
		return (name + "," + code + "," + status);
	}
	
	
}
