import java.io.*;
public class WriteObject {
	public static void main(String[] args){
		FileOutputStream fileOutput = null;
		ObjectOutputStream outStream = null;
		try {
			fileOutput = new FileOutputStream("proj.dot");
			outStream = new ObjectOutputStream(fileOutput);
				Project proj1 = new Project(20);
				outStream.writeObject(proj1);
		}
		catch (NotSerializableException ex)
		{
			
		}
	}

}
