// Assignment #: 5
// Arizona State University - CSE205
//         Name: Zach Lee
//    StudentID: 1203992720 
//      Lecture: 205
//  Description: Same thing as the member class except for non-members who receive no discount and do not keep a running point total
import java.text.NumberFormat;

public class NonMemberCustomer extends Customer{

	private double visitFee;
	
	// Constructor called from parent class + the visit fee for non Member customers
	public NonMemberCustomer(String fName, String lName, double amount, int year, int month, int date, double fee) {
		super(fName, lName, amount, year, month, date);
		visitFee = fee;
		
	}
	//computes the amount owed
	public void computePaymentAmount(){
		paymentAmount = purchasedAmount + visitFee;
	}
	//lists the toString for the non-member customers
	public String toString(){
		String nonMember = "\nNonMember Customer:"
				+ super.toString()
				+ "Visit Fee:\t\t"+NumberFormat.getCurrencyInstance().format(visitFee)+"\n";
		return nonMember;
	}

}
