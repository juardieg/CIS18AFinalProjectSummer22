/*
 * Diego Juarez 
 * Community garden program
 * This program will allow users to register and schedule an appointment to visit
 * the community garden
 */
import java.util.Scanner;
import java.io.*;

class GetInfo {
	static Scanner scanner = new Scanner(System.in);
	String UserName;
	ContactInfo userInfo = new ContactInfo("", "", "", "", "");
	char Dchoice;
	String HourTime;
	char donationChoice;
	//The choice method will ask the user to choose what day they would like to visit
	void choice() {
		System.out.println();
		System.out.println("Which day would you like to visit?");
		//This array that holds the days 
		String day[] = {
				"[1] Monday", "[2] Tuesday","[3] Wednesday", "[4] Thursday", "[5] Friday", "[6] Saturday"
		};
		//Loop that ends once it displays all the days in the array
		for (int i=0; i < 6; i++) {
			System.out.println(day[i]);
		}
		System.out.print("Enter a number to choose a day:");
		char getDate = scanner.next().charAt(0);
		//switch statement will serve as validation to check if user entered the correct choice
		switch (getDate) {
		//Each case statement will take the user to a different method
		case '1' :
		Monday();	
		break;
		
		case '2' :
		Tuesday();	
			break;
			
		case '3' :
		Wednesday();	
			break;
			
		case '4' :
		Thursday();	
			break;
			
		case '5' :
		Friday();	
			break;
			
		case '6' :
		Saturday();	
			break;
		//Default switch statement will verify user input	
		default:
		System.out.println();
		System.out.println("Invalid choice, please try again");
		choice(); //Makes the user enter a valid choice
			
		}
		
	}
	
	//Monday Method
	void Monday () {
	System.out.println();
	System.out.println("You chose Monday.");
	ContactInfo.Day = "Monday";
	ContactInfo.Names = getName(); //this method takes the user to the getName method to enter their name
	ContactInfo.Phone = getPhone();  // this will take the user to the getPhone method to input their phone number
	ContactInfo.Email = getEmail(); //This method will get the user's Email
	ContactInfo.Times = getTime(); //This will take the user to the getTime() method to confirm the appointment time
	Donate(); //The donate method will ask the user whether or not they would like to donate to the garden
	Summary(); //Once all is complete, this will take the user to the Summary method where the program will display the information the user entered
	}
	//Tuesday Method
	void Tuesday() {
		System.out.println();
		System.out.println("You chose Tuesday.");
		ContactInfo.Day = "Tuesday";
		ContactInfo.Names = getName(); //this method takes the user to the getName method to enter their name
		ContactInfo.Phone = getPhone(); // this will take the user to the getPhone method to input their phone number
		ContactInfo.Email = getEmail(); //This method will get the user's Email
		ContactInfo.Times = getTime(); //This will take the user to the getTime() method to confirm the appointment time
		Donate(); //The donate method will ask the user whether or not they would like to donate to the garden
		Summary(); //Once all is complete, this will take the user to the Summary method where the program will display the information the user entered
	}
	//Wednesday Method
	void Wednesday() {
		System.out.println();
		System.out.println("You chose Wednesday.");
		ContactInfo.Day = "Wednesday";
		ContactInfo.Names = getName(); //this method takes the user to the getName method to enter their name
		ContactInfo.Phone = getPhone(); // this will take the user to the getPhone method to input their phone number
		ContactInfo.Email = getEmail(); //This method will get the user's Email
		ContactInfo.Times = getTime(); //This will take the user to the getTime() method to confirm the appointment time
		Donate(); //The donate method will ask the user whether or not they would like to donate to the garden
		Summary(); //Once all is complete, this will take the user to the Summary method where the program will display the information the user entered
	}
	//Thursday Method
	void Thursday() {
		System.out.println();
		System.out.println("You chose Thursday.");
		ContactInfo.Day = "Thursday";
		ContactInfo.Names = getName();
		ContactInfo.Phone = getPhone();
		ContactInfo.Email = getEmail();
		ContactInfo.Times = getTime();
		Donate();
		Summary();
	}
	//Friday Method
	void Friday() {
		System.out.println();
		System.out.println("You chose Friday.");
		ContactInfo.Day = "Friday";
		ContactInfo.Names = getName(); //this method takes the user to the getName method to enter their name
		ContactInfo.Phone = getPhone(); // this will take the user to the getPhone method to input their phone number
		ContactInfo.Email = getEmail(); //This method will get the user's Email
		ContactInfo.Times = getTime(); //This will take the user to the getTime() method to confirm the appointment time
		Donate(); //The donate method will ask the user whether or not they would like to donate to the garden
		Summary(); //Once all is complete, this will take the user to the Summary method where the program will display the information the user entered
	}
	//Saturday method
	void Saturday() {
		System.out.println();
		System.out.println("You chose Saturday.");
		System.out.println("Saturday hours are from 8AM to 5PM");
		ContactInfo.Day = "Saturday";
		ContactInfo.Names = getName(); //this method takes the user to the getName method to enter their name
		ContactInfo.Phone = getPhone(); // this will take the user to the getPhone method to input their phone number
		ContactInfo.Email = getEmail(); //This method will get the user's Email
		ContactInfo.Times = getTimeSat(); //This method is special to Saturday since the hours are different
		Donate(); //The donate method will ask the user whether or not they would like to donate to the garden
		Summary(); //Method that takes the user to the Summary method
	}
	//The summary method will compile all the answers and display them as a final summary
	void Summary() {
		System.out.println();
		System.out.println("------------Order Summary------------------------");
		System.out.println("Name: " + ContactInfo.Names); //Displays the user's name
		System.out.println("Phone Number: " + ContactInfo.Phone); //Displays the user's phone number
		System.out.println("Email: " + ContactInfo.Email); //Displays the user's Email
		System.out.println("Appointment: " + ContactInfo.Day + " at " + ContactInfo.Times); //Displays the user's appointment day and time
		System.out.println("Thank you for visiting the Moreno Valley College Community Garden."); //program ends here
	}
	//This will allow the user to enter their name
	public static String getName() {
		String UserName;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		UserName = scan.nextLine(); 
		return UserName; //This will return a string containing the user's name
	}
	//This allows the user to enter their phone number 
	public static String getPhone() {
		String PhoneNumber;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your phone number");
		PhoneNumber = scan.nextLine();
		return PhoneNumber; //This will return a string which is the phone number
	}
	//The user will be able to enter their email here
	public static String getEmail() {
		String Email;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Email Address.");
		Email = scan.nextLine();
		return Email; //This method will return a string containing the email address
	}
	//The getTime method will ask the user when the would like to visit
	public static String getTime() {
		String DayChoice;
		Scanner scan = new Scanner (System.in);
		System.out.println();
		System.out.println("Please enter the time you would like to visit.");
		DayChoice = scan.nextLine();
		return DayChoice;
		}
	//This method will be used in case the user chooses Saturday
	public static String getTimeSat() {
		String DayChoice;
		Scanner scan = new Scanner (System.in);
		System.out.println();
		System.out.println("Please enter the time you would like to visit.");
		System.out.println("We are open saturdays from 8:00AM to 5:00PM");
		DayChoice = scan.nextLine();
		return DayChoice;
	}
	//This method will ask the user if they would like to donate
	public static char Donate() {
		char Donate;
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Select one of the following items to donate:");
		//This array holds the different donations
		String Items[] = { "[1] Seeds", "[2] Soil", "[3] Fertilizer", "[4] gardening toools", "[5] Voluntary labor", 
				"[6] Skip"
				+ " donation"
		};
		//This loop displays the items that a user can choose to donate
		for (int i=0; i < 6; i++) {
			System.out.println(Items[i]);
	}
		Donate = scanner.next().charAt(0); 
		//Switch case will control user input and verify that they chose the correct item
		switch (Donate) {
		case '1' :
			System.out.println("Thank you for donating Seeds."); //user chooses to donate seeds
			return Donate;
		case '2' :
			System.out.println("Thank you for donating Soil."); //user chooses to donate soil
			return Donate;
		case '3' :
			System.out.println("Thank you for donating Fertilizer."); //user chooses to donate fertilizer
			return Donate;
		case '4' :
			System.out.println("Thank you for donating Gardening Tools."); //user chooses to donate tools
			return Donate;
		case '5' :
			System.out.println("Thank you for volunteering to help."); //user chooses to help the garden
			return Donate;
		case '6' :
			System.out.println(); //user skips the donation
			System.out.println();
			return Donate;
		default : //default statement will verify if the user entered a correct choice
			System.out.println();
			System.out.println("Invalid choice, please try again");
			Donate();
			}
		return Donate;				
}
	
	

//This class holds the contact info that will be used during the final summary
	class ContactInfo {
	public static String Names; //user name
	public static String Phone; // user phone number
	public static String Email; //user Email
	public static String Times; //Appointment time
	public static String Day; //Appointment Date
	public ContactInfo (String Names, String Phone, String Email, String Times, String DayChosen) {
		this.Names = Names;
		this.Phone = Phone;
		this.Email = Email;
		this.Times = Times;
		this.Day = DayChosen;
	}
	}
}
	//Main class where the program begins
    class GardenMain {

	public static void main(String[] args) throws java.io.IOException {
			
		Scanner scanner = new Scanner (System.in);
		GetInfo c = new GetInfo();
		
	//Beginning of the program. This welcomes the user
		System.out.println("Welcome to the public community garden at Moreno Valley College.");
		System.out.println("During each appointment, patrons "
				+ "can pick fresh produce, fruits and vegetables, at this garden at no cost. ");
		System.out.println("The community garden operates 8:00 AM - 8:00 PM Monday - Friday,"
				+ " and 8:00AM - 5:00OPM on Saturdays.");
		// This method will take the user to the choice method where they'll be able to choose a day to visit the garden
		c.choice();				
	}
    }