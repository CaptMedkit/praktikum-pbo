/*	Nama File: DAOManager.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	30/05/2023
*/

public class DAOManager
{
	private PersonDAO personDAO;
	
	public void setPersonDAO(PersonDAO person)
	{
		personDAO = person;
	}
	
	public PersonDAO getPersonDAO()
	{
		return personDAO;
	}
}