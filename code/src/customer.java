import java.text.SimpleDateFormat;
import java.util.Date;


public class customer extends User{

	String date_joined;	//constructor will initialize this variable
	Boolean status;	//true for members that are active, false for those who aren't
	
	public customer(String fn, String ln, int id) {
		super(fn, ln, id);
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		
		date_joined = formatter.format(date);	//returns the day the class was constructed
	}
	
	public String toString() {
		return (super.toString() + "," + date_joined);
	}
	
	//The getters and setters are inherited from the user class!
	
	public Boolean getStatus() {
		return status;
	}
}
