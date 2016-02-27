// Assignment #: 5
// Arizona State University - CSE205
//         Name: Zach Lee
//    StudentID: 1203992720 
//      Lecture: 205
//  Description: This Class is a subClass of Customer, it uses the parent class to create many of its methods
// it also calculates the cost for members and keeps a toll of the amount of points the user has
public class MemberCustomer extends Customer {

	private int pointsCollected;
	private double discount1 = .9;
	private double discount2 = .8;
	private double pointPercent = 0.01;
	public MemberCustomer(String fName, String lName, double amount, int year, int month, int date, int points) {
		super(fName, lName, amount, year, month, date);
		pointsCollected = points;
	}

	public void computePaymentAmount(){
		if (pointsCollected>100){
			paymentAmount=purchasedAmount * discount2;
			
		} else if (pointsCollected<=100){
			paymentAmount=purchasedAmount * discount1;
		}
		pointsCollected += purchasedAmount * pointPercent;
	}
	
	public String toString(){
		String cout = "\nMember Customer:"
				+super.toString()
				+"Collected Points:\t"+pointsCollected+"\n";
		return cout;
	}
	
	
	
}
