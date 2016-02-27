import java.util.*;

public class ScannerPractice {

	public static void main(String[] args) {
		
		String str = "-1 -2 -3 -19 1 2 3 4 -8 5 6 7 8";
		
		Scanner fromStr = new Scanner(str);
		
		System.out.println("The numbers in the String are: "+str);
		
		int sum = 0;
		int hold = 0;
		int neg = 0;
		int sumNeg = 0;
		int holdNeg = 0;
		
		while(fromStr.hasNextInt())
		{
			int temp = fromStr.nextInt();
			
			if(temp>=0){
				hold = sum;
				sum += temp;
				System.out.println( "Sum of positive Intergers: " +hold+ " + " +temp+ " = " +sum);
				
			}
			else if(temp<0){
				holdNeg = sumNeg;
				sumNeg += temp;
				System.out.println( "Sum of negative Intergers: " +holdNeg+ " + " +temp+ " = " +sumNeg);
				
			}
			
		}
	
	}

}
