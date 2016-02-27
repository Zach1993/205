import java.io.*;
public class ReadingObjects {
	public static void main(String[] args)
	{
		FileInputStream fileInput = null;
		ObjectInputStream inStream = null;
		try
		{
			fileInput = new FileInputStream("proj.dot");
			inStream = new ObjectInputStream(fileInput);
			Object obj1 = inStream.readObject();
			if(obj1 instanceof Project)//class name
			{
				Project proj1 = (Project) obj1;
				String name = ( proj1).getName();
			}
		}
		catch(ClassNotFoundException ex)
		{	
			
		}
		catch(FileNotFoundException ex)
		{
			
		}
		catch(IOException ex)
		{
			
		}
		finally
		{
			if(inStream != null)
				inStream.close();
		}
				
	}

}
