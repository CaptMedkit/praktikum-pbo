/*	Nama File: ExceptionOnArray.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	29/03/2023
*/

public class ExceptionOnArray
{
	public static void main(String[] args)
	{
		Integer[] arrayInteger = new Integer[4];
		try
		{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}
		catch (ArrayIndexOutOfBoundsException exception)
		{
			exception.printStackTrace();
		}
		finally
		{
			System.out.println("clean up code...");
		}
	}
}