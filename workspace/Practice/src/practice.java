import java.util.*;
import java.math.*;

public class practice {
	

	    public static void main(String[] args )
	    {
	    	double one;
	    	double two;
	    	double three;
	    	double four;
	    	
	    	Random rn = new Random();
	    	int answer = rn.nextInt(10) + 1;
	    
		
	    	String out = "Please enter your guess: ";
	    	System.out.print(out);
			Scanner scan = new Scanner(System.in);
	    	int guess = scan.nextInt();
	    	if(guess==answer){
	    		System.out.println("Great JOB! You are Correct!");
	    	}
	    		else {
	    			System.out.println("Nope, maybe next time! The Correct answer was: "+answer);
	    			
	    		}
	    		
	    	}
	   }

