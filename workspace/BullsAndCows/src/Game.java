import java.util.*;
import java.math.*;

public class Game {
	private int bullCount;
	private int cowCount;
	private int gOne;
	private int gTwo;
	private int gThree;
	private int gFour;
	private double cOne;
	private double cTwo;
	private double cThree;
	private double cFour;
	
	
	//Constructor method initializing all variables to 0
	public Game()
	{
		bullCount=0;
		cowCount=0;
		gOne=0;
		gTwo=0;
		gThree=0;
		gFour=0;
	}
	// random number generator, generating numbers from 1-9
	public void random()
	{
		double[] randomNumber = new double[4];
		for (int i = 0; i < 4; i++)
		{
			randomNumber[i] = Math.random()*10;
			
		}
		cOne = randomNumber[0];
		cTwo = randomNumber[1];
		cThree = randomNumber[2];
		cFour = randomNumber[3];
	}
	
	
	// to string that outputs the random numbers stored in the four variables
	public String toString()
	{
		String Cout= "First Random Number: "+(int) cOne+
				"\nSecond Random Number: " +(int) cTwo+
				"\nThird Random Number: " +(int) cThree+
				"\nFourth Random Number: " +(int) cFour;
		return Cout;
	}
	
	
}
