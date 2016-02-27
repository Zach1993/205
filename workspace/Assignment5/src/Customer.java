// Assignment #: 5
// Arizona State University - CSE205
//         Name: Zach Lee
//    StudentID: 1203992720 
//      Lecture: 205
//  Description: The Customer.java class is an abstract class that has several member methods,
// this class in particular is a parent class to two children MemberCustomer and NonMemberCustomer which use the abstract methods provided
//
import java.text.NumberFormat;

public abstract class Customer {
	
	protected String firstName;
	protected String lastName;
	protected String studentID;
	protected double purchasedAmount;
	protected int purchasedYear;
	protected int purchasedMonth;
	protected int purchasedDate;
	protected double paymentAmount;
	// Default Constructor that initializes all variables
	public Customer(String fName, String lName, double amount, int year, int month, int date)
	{
		firstName = fName;
		lastName = lName;
		purchasedAmount = amount;
		purchasedYear = year;
		purchasedMonth = month;
		purchasedDate = date;
		paymentAmount = 0;
	}
	// gets the amount purchased by customer and displays it
	public double getPurchasedAmount()
	{
		return purchasedAmount;
	}
	// abstract method, defined elsewhere
	public abstract void computePaymentAmount();
	//toString that displays the variables, and converts the numbers to currency
	public String toString()
	{
		String cout = "\nFirst name:\t\t" +firstName+"\n"
				+ "Last name:\t\t"+lastName+"\n"
				+ "Purchased Amount:\t" +NumberFormat.getCurrencyInstance().format(purchasedAmount)+"\n"
				+ "Purchased Date:\t\t" +purchasedMonth+"/"+purchasedDate+"/"+purchasedYear+"\n"
				+ "Payment Amount:\t\t" +NumberFormat.getCurrencyInstance().format(paymentAmount)+"\n";
		return cout;
		
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
