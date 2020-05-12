package project;
//package project;
import java.util.*;

public class equipment {	//I know its spelled wrong!
	String name;
	int code;
	String status;
	
	public equipment() {
		name = "";
		code = 0;
		status = "";
	}
	public equipment(String n, int c, String s) {
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
		String result = name + "_" + code + "_" + status;
		return result;
	}
	
	
}
