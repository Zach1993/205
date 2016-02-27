import java.util.*;
public class parsingPractice {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int[] numbers = new int[4];
		
		for(int i = 0; i < numbers.length; i++){
			if(i==0){
			System.out.println("Please enter your first number: "); // Prompts user for initial Integer
			} 
			else{
				System.out.println("Please enter your next number: "); // Prompts user for next Integers
			}
			numbers[i] = userInput.nextInt();
		}
		
		// for loop for printing out the elements of the array
		for(int i = 0; i < numbers.length; i++){
		System.out.println(numbers[i]);
		}
		
	}

}
