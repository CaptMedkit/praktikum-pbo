/*	Nama File: MainDAO.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	30/05/2023
*/

public class MainDAO
{
	public static void main(String args[])
	{
		Person person = new Person("Indra");
		DAOManager m = new DAOManager();
		m.setPersonDAO(new MySQLPersonDAO());
		try
		{
			m.getPersonDAO().savePerson(person);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}