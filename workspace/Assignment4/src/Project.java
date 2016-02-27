// Assignment #: 4
// Arizona State University - CSE205
// Name: Zach Lee
// StudentID:1203992720
// Lecture: Nakamura Tues/Thurs
// Description: Assignment 4 class displays a menu of choices to a user
//        and performs the chosen task. It will keep asking a user to
//        enter the next choice until the choice of 'Q' (Quit) is entered.
public class Project {
	private String projName;
	private int projNumber;
	private String projLocation;
	private Budget projBudget;
	
	public Project(double amount){
		projName="?";
		projNumber = 0;
		projLocation = "?";
		projBudget = new Budget(amount);
	}
	
	public String getName(){
		return projName;
	}
	
	public int getNumber(){
		return projNumber;
	}
	public String getLocation(){
		return projLocation;
	}
	public Budget getBudget(){
		return projBudget;
	}
	public void setName(String aName){
		projName=aName;
	}
	public void setNumber(int aNumber){
		projNumber=aNumber;
	}
	public void setLocation(String aLocation){
		projLocation=aLocation;
	}
	
	public boolean addExpenditure(double amount){
		boolean varEx = projBudget.addSpending(amount);
		return varEx;
		
	}
	public String toString(){
	String variable = "\nProject Name:\t\t"+projName+"\n"
			+ "Project Number:\t\t"+projNumber+"\n"
			+ "Project Location:\t"+projLocation+"\n"
			+ projBudget.toString()+"\n\n";
	return variable;
			
		
	}
}
