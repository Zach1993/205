// Assignment #: 5
// Arizona State University - CSE205
//         Name: Zach Lee
//    StudentID: 1203992720 
//      Lecture: 205
//  Description: This class parses the needed user input so that it can be placed 
// into the correct class to be calculated and returned
public class CustomerParser {
public static Customer parseStringToCustomer(String lineToParse){
	Customer customer;
	String[] parsedString = lineToParse.split("/");
	if (parsedString[0].equals("member") || parsedString[0].equals("Member")){
		customer = new MemberCustomer(parsedString[1], parsedString[2], Double.parseDouble(parsedString[3]), 
				Integer.parseInt(parsedString[4]), Integer.parseInt(parsedString[5]), 
				Integer.parseInt(parsedString[6]), Integer.parseInt(parsedString[7]));
	}else{
		customer = new NonMemberCustomer(parsedString[1], parsedString[2], Double.parseDouble(parsedString[3]), 
			Integer.parseInt(parsedString[4]), Integer.parseInt(parsedString[5]), 
			Integer.parseInt(parsedString[6]), Double.parseDouble(parsedString[7]));
	}
	return customer;

}
}
