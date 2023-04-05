/*	Nama File: Asersi1.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	29/03/2023
*/

public class Asersi1
{
	public static void main(String[] args)
	{
		int x = 0;
		if (x > 0)
		{
			System.out.println("x bilangan positif");
		}
		else
		{
			assert (x < 0): "ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}