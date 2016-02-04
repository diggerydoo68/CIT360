package softwareDev;
import java.io.*;

public class SerializeDemo { // definition of new public class
	public static void main(String [] args) // definition of main method inside the Serialized Demo class
	{
		Employee e = new Employee(); //new object created with the attributes below
		e.name = "Reyan Ali";
		e.address = "Phokka Kuan, Ambehta Peer";
		e.SSN = 11122333;
		e.number = 101;
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
		}catch(IOException i)
		{
			i.printStackTrace();
		}
	}
}
