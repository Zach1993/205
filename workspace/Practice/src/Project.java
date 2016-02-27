import java.io.Serializable; // Serializable is an interface

public class Project implements Serializable{ // Do not implement Serializable if you dont want people 
	// to be able to store the objects of your class
	private String projName; // Serializable
	private int projNumber;  // Serializable
	//private Budget projBudget; (This object can not be stored unless Budget class also implements serializable)

}