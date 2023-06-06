/*	Nama File: Person.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	30/05/2023
*/

public class Person
{
	private int id;
	private String name;
	
	public Person(String n)
	{
		name = n;
	}
	
	public Person(int i, String n)
	{
		id = i;
		name = n;
	}
	
	public int getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
}