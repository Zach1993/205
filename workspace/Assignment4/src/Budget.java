// Assignment #: 4
// Arizona State University - CSE205
// Name: Zach Lee
// StudentID:1203992720
// Lecture: Nakamura Tues/Thurs
// Description: Assignment 4 class displays a menu of choices to a user
//        and performs the chosen task. It will keep asking a user to
//        enter the next choice until the choice of 'Q' (Quit) is entered.
import java.text.*;
//declares three private variables
public class Budget {
	private double initialFunding;
	private double spending;
	private double currentBalance;
//Constructor method that initializes initial funding, spending, and current balance
	
	public Budget(double funding){
		initialFunding = funding;
		spending = 0.0;
		currentBalance = initialFunding-spending;
	}
//method that allows user to add spending
	
	public boolean addSpending (double amount){
		if(amount > 0 && amount <= currentBalance){
			spending += amount;
			currentBalance = initialFunding - spending;
			return true;
		}else
			return false;
		}
//outputs the initial funding amount, spending, and current balance of account.
	public String toString(){
		String alpha = "Budget:"
				+ "\nInitial Funding\t"+ NumberFormat.getCurrencyInstance().format(initialFunding)
				+ "\nSpending\t"+ NumberFormat.getCurrencyInstance().format(spending)
				+ "\nCurrent Balance\t"+ NumberFormat.getCurrencyInstance().format(currentBalance);
		return alpha;
		
	}

}
