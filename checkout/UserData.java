package project;

public class UserData {
	//userData is ONLY USED FOR CUSTOMERS!
	//this class will hold all the customers information
	Customer[] users;
	int customerLimit = 20;	//we will use customer limit for demonstration purposes
	int custNum;

	public UserData(){
		users = new Customer[customerLimit];
		custNum = 0;
	}

	public UserData(Customer[] info, int num) {	//this constructor will pass in a customers array and the number of customers
		users = new Customer[customerLimit];

		for(int i = 0; i < num; i++) {
			users[i] = info[i];
		}
		custNum = num;
	}

	public void addUser(Customer info) {
		users[custNum] = info;
		custNum++;
		return;
	}

	public String userToString() {	//each customer will be connected with "_" and seperated with ","
		String result = "";
		for(int i = 0; i < custNum; i++) {
			result = result + users[i].fullToString() + ",";
		}
		return result;
	}

	public void loadUserData() {
		//load the users information here from a text file
		//when loading the data, make sure to create a customer array and a count variable to send into the constructor

	}

	public void saveUserData() {
		//save the users information here to a text file
	}

}
