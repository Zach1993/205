// Assignment #: 5
// Arizona State University - CSE205
//         Name: Zach Lee
//    StudentID: 1203992720 
//      Lecture: 205
//  Description: The Assignment 5 class displays a menu of choices
//               (add a member or non-member customer,
//               compute their payment amount, count certain students,
//               list students, quit, display menu) to a user.
//               Then it performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.io.*;         //to use InputStreamReader and BufferedReader
import java.util.*;       //to use ArrayList
import java.text.NumberFormat;

public class Assignment5
 {
  public static void main (String[] args)
   {
     char input1;
     String inputInfo = new String();
     String line = new String();
     boolean operation;

     // ArrayList object is used to store customer objects
     ArrayList customerList = new ArrayList();

     try
      {
       printMenu();     // print out menu

       // create a BufferedReader object to read input from a keyboard
       InputStreamReader isr = new InputStreamReader (System.in);
       BufferedReader stdin = new BufferedReader (isr);

       do
        {
         System.out.println("What action would you like to perform?");
         line = stdin.readLine().trim();
         input1 = line.charAt(0);
         input1 = Character.toUpperCase(input1);

         if (line.length() == 1)
          {
           switch (input1)
            {
             case 'A':   //Add Customer
               System.out.print("Please enter some customer information to add:\n");
               inputInfo = stdin.readLine().trim();
           // takes user input and parses it according to the Customer type
               
         Customer customer1 = CustomerParser.parseStringToCustomer(inputInfo);
         customerList.add(customer1);

               break;
             case 'C':   //Compute Payment Amount
           for(int i = 0; i < customerList.size(); i++){
        	   ((Customer)customerList.get(i)).computePaymentAmount();
           } 
/***********************************************************************************
***  ADD your code here to compute the payment amount for all customers in the customerList.
***********************************************************************************/
                System.out.print("payment amount computed\n");
               break;
             case 'D':   //Count certain customers
               System.out.print("Please enter a purchased amount:\n");
               inputInfo = stdin.readLine().trim();
               double amount = Double.parseDouble(inputInfo);
               int count = 0;
               
            for(int i=0; i < customerList.size(); i++){
            	if(((Customer)customerList.get(i)).getPurchasedAmount() > amount){
            		count++;
            	}
            }
            
/***********************************************************************************
***  ADD your code here to count the number of customers who purchased more than the specified amount.
***********************************************************************************/
                NumberFormat money = NumberFormat.getCurrencyInstance();
                System.out.println("The number of customers who purchased more than " + money.format(amount)
                                 + " is: " + count);
               break;
             case 'L':   //List Customers
            	 
                 	if(customerList.isEmpty()==true){
                 		System.out.println("no customer");
                 	}
                 	else{
                 		for(int i=0; i < customerList.size(); i++){
                 		System.out.println(((Customer)customerList.get(i)));
                 	}
            	 }	
/***********************************************************************************
***  ADD your code here to print out all customer objects. If there is no customer,
***  print "no customer\n"
***********************************************************************************/
               break;
             case 'Q':   //Quit
               break;
             case '?':   //Display Menu
               printMenu();
               break;
             default:
               System.out.print("Unknown action\n");
               break;
            }
         }
        else
         {
           System.out.print("Unknown action\n");
          }
        } while (input1 != 'Q'); // stop the loop when Q is read
      }
     catch (IOException exception)
      {
        System.out.println("IO Exception");
      }
  }

  /** The method printMenu displays the menu to a user **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                      "------\t\t------\n" +
                      "A\t\tAdd Customer\n" +
                      "C\t\tCompute Payment Amount\n" +
                      "D\t\tCount Certain Customers\n" +
                      "L\t\tList Customers\n" +
                      "Q\t\tQuit\n" +
                      "?\t\tDisplay Help\n\n");
  }
}


