

public class main{
	
	public static void main(String arg[]) {
		
		//in the main file we will store which user is signed in into their own variable that will
		//be passed into other functions
		//customer current_user = new customer();	we will get this information after sign-in
		
		String fn = "Carlos";
		String ln = "Vera";
		int id = 123;
		
		
		customer exam = new customer(fn, ln, id);
		exam.getFName();
		
		
	}
	
}