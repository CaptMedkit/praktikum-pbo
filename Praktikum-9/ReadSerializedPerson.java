/*	Nama File: ReadSerializedPerson.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	30/05/2023
*/

import java.io.*;

public class ReadSerializedPerson
{
	public static void main(String[] args)
	{
		Person person = null;
		try
		{
			FileInputStream f = new FileInputStream("person.ser");
			ObjectInputStream s = new ObjectInputStream(f);
			person = (Person)s.readObject();
			s.close();
			System.out.println("Serialized person name = " + person.getName());
		}
		catch(Exception ioe)
		{
			ioe.printStackTrace();
		}
	}
}