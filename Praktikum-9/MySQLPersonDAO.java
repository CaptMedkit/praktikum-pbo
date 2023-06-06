/*	Nama File: MySQLPersonDAO.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	30/05/2023
*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO
{
	public void savePerson(Person person) throws Exception
	{
		String name = person.getName();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "XXXXXXXXXXXX");
		
		String query = "INSERT INTO person(name) VALUES('"+ name +"')";
		System.out.println(query);
		Statement s = con.createStatement();
		s.executeUpdate(query);
		
		con.close();
	}
}
